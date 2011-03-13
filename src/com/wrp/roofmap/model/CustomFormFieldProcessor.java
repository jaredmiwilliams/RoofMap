package com.wrp.roofmap.model;

import java.lang.reflect.Field;
import java.util.HashMap;

public interface CustomFormFieldProcessor {
	public void execute(Object object, Field field, HashMap<String, String> invalidFields);
}
