package com.ies.Anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Oficiales {
	
	OficialAnotado[] value();

}
