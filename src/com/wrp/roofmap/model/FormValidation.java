package com.wrp.roofmap.model;

import java.lang.reflect.Field;
import java.util.HashMap;

public class FormValidation implements FormValidationInterface {
	protected HashMap<String, String> invalidFields;
	
	public void FormValidationInterface() {
		invalidFields = new HashMap<String, String>();
	}
	
	@Override
	public HashMap<String, String> getInvalidFields() {
		return invalidFields;
	}

	@Override
	public boolean validateInputs(Object object) {
		if(object == null)
			return false;
		
		for(Field field:object.getClass().getDeclaredFields()) {
			FormField formField =  null;
			if((formField = field.getAnnotation(FormField.class)) == null) {
				continue;
			}
			
			Class<? extends CustomFormFieldProcessor> customProcessorClass = formField.customProcessor();
			int max = formField.maximumLength();
			int min = formField.minimumLength();
			boolean required = formField.required();
			
			try {
				if(customProcessorClass == null) {
					String value = field.get(object).toString();
					
					if(value == null) {
						if(required) {
							invalidFields.put(field.getName(), "This is a required field");
						}
						else {
							continue;
						}
					}
					else {
						if(min != -1 && value.length() < min) {
							invalidFields.put(field.getName(), "Below the minimum length");
							continue;
						}
						if(max != -1 && value.length() > max) {
							invalidFields.put(field.getName(), "Above the maximum length");
							continue;
						}
						
						if(value.matches(formField.value())) {
							continue;
						}
						else {
							invalidFields.put(field.getName(), formField.failureMessage());
						}
					}
				}
				else {
					CustomFormFieldProcessor customProcessor = customProcessorClass.newInstance();
					customProcessor.execute(object, field, invalidFields);
				}
				
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public void addInvalidField(String key, String value) {
		invalidFields.put(key, value);
	}

	@Override
	public void setInvalidFields(HashMap<String, String> invalidFields) {
		this.invalidFields = invalidFields;
	}
}
