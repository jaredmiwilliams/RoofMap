package com.wrp.roofmap.model;

import java.util.HashMap;

public interface FormValidationInterface {
	public boolean validateInputs(Object object);
	public HashMap<String, String> getInvalidFields();
	public void setInvalidFields(HashMap<String, String> invalidFields);
	public void addInvalidField(String key, String value);
}
