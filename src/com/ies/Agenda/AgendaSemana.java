package com.ies.Agenda;

import java.util.List;
import java.util.ArrayList;

@Tarea(titulo="Estudiar", descripcion="Estudiar java", dia=6, hora=12)
@Tarea(titulo="Deberes", descripcion="Hacer tarea", dia=12, hora=9)
@Tarea(titulo="Test", descripcion="Test autoescuela", dia=1, hora=11)
@Tarea(titulo="Proyecto", descripcion="hacer proyecto tfg", dia=2, hora=12)
public class AgendaSemana {
	
	private List<Tareas> agenda;
	
	public AgendaSemana() {
		this.agenda=new ArrayList<>();
	}
		
	public List<Tareas> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Tareas> agenda) {
		this.agenda = agenda;
	}
	
	public void aniadirTarea(Tareas tarea) {
		this.agenda.add(tarea);
	}
	
	

	@Override
	public String toString() {
		return "AgendaSemana [agenda=" + agenda.toString() + "]";
	}

	public static AgendaSemana contexto() {
		AgendaSemana agenda = new AgendaSemana();
		
		Tarea[] tareaAnotada = AgendaSemana.class.getAnnotationsByType(Tarea.class);
		
			for(Tarea tareaAnotadas: tareaAnotada) {
				Tareas tarea = new Tareas();
				
				tarea.setDescripcion(tareaAnotadas.descripcion());
				tarea.setTitulo(tareaAnotadas.titulo());
				tarea.setDia(tareaAnotadas.dia());
				tarea.setHora(tareaAnotadas.hora());
				
				
				agenda.aniadirTarea(tarea);
				
			}
		
		return agenda;
	}
	
	
}


