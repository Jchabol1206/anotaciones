package com.ies.Anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Repeatable(Empleados.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmpleadoAnotado {
	String nombre();
	String apellido();
	String dni();
	String direccion();
	String telefono();
	
	

}
