package com.ies.Anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Tecnicos.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TecnicoAnotado {
	EmpleadoAnotado empleadoAnotado();
	String perfil();

}
