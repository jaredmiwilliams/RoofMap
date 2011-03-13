package com.wrp.roofmap.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

public class FormReader {
	HttpServletRequest request;
	HashMap<String, String> requestFieldMap;
	
	public FormReader(HttpServletRequest request) {
		this.request = request;
		initializeRequestFieldMap();
	}
	
	public Object populateObject(Class<?> clazz) {
		Object returnObject = null;
		try {
			returnObject = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		if(returnObject == null)
			return null;
		
		for(Field field:clazz.getDeclaredFields()) {
			if(requestFieldMap.containsKey(field.getName()))
				setObjectField(field, clazz, returnObject);
		}
		
		return returnObject;
	}
	
	private void setObjectField(Field field, Class<?> clazz, Object object) {
		String capitalizedFieldName = capitalizeFirstLetter(field.getName());
		Method setMethod = null;
		try {
			setMethod = clazz.getDeclaredMethod("set" + capitalizedFieldName, String.class);
			setMethod.invoke(object, requestFieldMap.get(field.getName()));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	private void initializeRequestFieldMap() {
		if(requestFieldMap == null) 
			requestFieldMap = new HashMap<String, String>();
		
		for(Object key:request.getParameterMap().keySet()) {
			if(key instanceof String) {
				Object value = request.getParameterMap().get(key);
				if(value instanceof String) {
					requestFieldMap.put(
							formatFieldName((String)key),
							(String)request.getParameterMap().get(key));
				}
				else if(value instanceof Object[]) {
					if(value != null) {
						Object[] values =  (Object[])value;
						
						if(values.length != 0) {
							if(values[0] instanceof String) {
								requestFieldMap.put(
										formatFieldName((String)key),
										(String)values[0]);
							}
						}
					}
				}
			}
		}
	}
	
	//this_field -> thisField
	private String formatFieldName(String fieldName) {
		String returnString = "";
		
		String[] strings = fieldName.split("_");
		for(String string:strings) {
			if(returnString.equals(""))
				returnString += string;
			else
				returnString += capitalizeFirstLetter(string);
		}
		
		return returnString;
	}
	
	//this -> This
	private String capitalizeFirstLetter(String string) {
		return string.substring(0,1).toUpperCase() + string.substring(1, string.length());
	}
	
}
