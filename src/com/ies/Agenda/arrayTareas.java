package com.ies.Agenda;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface arrayTareas {
	Tarea[] value();
}
