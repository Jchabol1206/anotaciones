package com.ies.Agenda;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(arrayTareas.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tarea {
	String titulo();
	String descripcion() default "";
	int dia();
	int hora();

}
