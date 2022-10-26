package com.ies.Anotaciones;

import java.util.ArrayList;
import java.util.List;

@DirectivoAnotado(apellido = "Ortegazo", direccion = "C/ A", dni = "74859612", nombre = "o", telefono = "987654321")
@DirectivoAnotado(apellido = "Ortega", direccion = "C/ A", dni = "74859612", nombre = "Amancio", telefono = "987654321")
@TecnicoAnotado(apellido = "Orteguita", direccion = "", dni = "", nombre = "Amancito", telefono = "", codigoTaller = 100)
@OficialAnotado(apellido = "Orteguita", direccion = "", dni = "", nombre = "Amancito", telefono = "", codigoTaller = 100)
public class Empresa {
	private String nombre;
	private List<Empleado> listaEmpleados;
	
	public Empresa() {
		this.listaEmpleados= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", listaEmpleados=" + listaEmpleados.toString() + "]";
	}
	
	public void aniadirEmpleado(Empleado empleado) {
		this.listaEmpleados.add(empleado);
	}
	
	public static Empresa cargadorContexto() {
		Empresa empresa = new Empresa();
		
		EmpleadoAnotado[] anotadoEmpleado = Empresa.class.getDeclaredAnnotationsByType(EmpleadoAnotado.class);
		
		for(EmpleadoAnotado anotadoEmpleados: anotadoEmpleado) {
			
			if(anotadoEmpleados.clase().equals("Directivo")) {
				Directivo directivo = new Directivo();
				directivo.setNombre(anotadoEmpleados.nombre());
				empresa.aniadirEmpleado(directivo);
			}
			if(anotadoEmpleados.clase().equals("Oficial")) {
				Oficial oficial = new Oficial();
				
				oficial.setNombre(anotadoEmpleados.nombre());
				empresa.aniadirEmpleado(oficial);
			}
			if(anotadoEmpleados.clase().equals("Tecnico")) {
				Tecnico tecnico = new Tecnico();
				
				tecnico.setNombre(anotadoEmpleados.nombre());
				empresa.aniadirEmpleado(tecnico);
			}
			
		}
		
		
		
		
		return empresa;
	}
	

}
