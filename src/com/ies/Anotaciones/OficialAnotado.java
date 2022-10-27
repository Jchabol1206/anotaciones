package com.ies.Anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Oficiales.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface OficialAnotado {
	EmpleadoAnotado empleadoAnotado();
	String categoria() default "";
}
