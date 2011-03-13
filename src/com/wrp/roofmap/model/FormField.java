package com.wrp.roofmap.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FormField {
	String value() default ".+";
	int minimumLength() default -1;
	int maximumLength() default -1;
	boolean required() default true;
	String failureMessage() default "Please verify the input is correct";
	Class<CustomFormFieldProcessor> customProcessor();
}
