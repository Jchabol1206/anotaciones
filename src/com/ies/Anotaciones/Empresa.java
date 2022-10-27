package com.ies.Anotaciones;

import java.util.ArrayList;
import java.util.List;

@DirectivoAnotado(empleadoAnotado=@EmpleadoAnotado(apellido = "Ortegazo", direccion = "C/ A", dni = "74859612", nombre = "o", telefono = "987654321"), codigoDespacho=1)
@DirectivoAnotado(empleadoAnotado=@EmpleadoAnotado(apellido = "Ortega", direccion = "C/ A", dni = "74859612", nombre = "Amancio", telefono = "987654321"), codigoDespacho=1)
@TecnicoAnotado(empleadoAnotado=@EmpleadoAnotado(apellido = "Orteguita", direccion = "", dni = "", nombre = "Amancito", telefono = "", codigoTaller = 100), perfil="perfil")
@OficialAnotado(empleadoAnotado=@EmpleadoAnotado(apellido = "Orteguita", direccion = "", dni = "", nombre = "Amancito", telefono = "", codigoTaller = 100), categoria="una")
@OficialAnotado(empleadoAnotado=@EmpleadoAnotado(apellido = "Orteguita", direccion = "", dni = "", nombre = "Amancito", telefono = "", codigoTaller = 100), categoria="una")
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
		
		DirectivoAnotado[] anotadoDirectivo = Empresa.class.getDeclaredAnnotationsByType(DirectivoAnotado.class);
		OficialAnotado[] anotadoOficial = Empresa.class.getDeclaredAnnotationsByType(OficialAnotado.class);
		TecnicoAnotado[] anotadoTecnico = Empresa.class.getDeclaredAnnotationsByType(TecnicoAnotado.class);
		
		for(DirectivoAnotado anotadoDirectivos:anotadoDirectivo) {
			
			Directivo directivo = new Directivo();
			directivo.setNombre(anotadoDirectivos.empleadoAnotado().nombre());
			empresa.aniadirEmpleado(directivo);
		}
		
		for(OficialAnotado anotadoOficiales:anotadoOficial) {
			Oficial oficial = new Oficial();
			oficial.setNombre(anotadoOficiales.empleadoAnotado().nombre());
			empresa.aniadirEmpleado(oficial);
		}
		
		for(TecnicoAnotado anotadoTecnicos:anotadoTecnico) {
			Tecnico tecnico = new Tecnico();
			tecnico.setNombre(anotadoTecnicos.empleadoAnotado().nombre());
			empresa.aniadirEmpleado(tecnico);
		}
		
		
		
		return empresa;
	}
	

}
