package com.ies.Agenda;

public class Tareas {
	private String titulo;
	private String descripcion;
	private int dia;
	private int hora;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "Tareas [titulo=" + titulo + ", descripcion=" + descripcion + ", dia=" + dia + ", hora=" + hora + "]";
	}
	
	
	
	
}
