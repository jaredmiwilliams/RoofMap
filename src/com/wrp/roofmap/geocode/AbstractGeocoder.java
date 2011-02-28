package com.wrp.roofmap.geocode;

import com.wrp.roofmap.model.Point;

public abstract interface AbstractGeocoder {
	public Point doParsing(String address);
	public String constructUrl(String address);
}
