package com.ies.Anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Directivos.class)
@Retention(RetentionPolicy.RUNTIME)

public @interface DirectivoAnotado {
	EmpleadoAnotado empleadoAnotado();
	int codigoDespacho() default -1;
	
	
	
}
