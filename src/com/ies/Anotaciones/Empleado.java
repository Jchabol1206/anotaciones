package com.ies.Anotaciones;

public abstract class Empleado {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String dni;
	private int telefono;
	
	public String getNombre() {
		return nombre;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", dni=" + dni
				+ ", telefono=" + telefono + "]";
	}


	public String getApellidos() {
		return apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

}
