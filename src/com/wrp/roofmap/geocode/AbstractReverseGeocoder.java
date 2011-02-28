package com.wrp.roofmap.geocode;


import java.util.List;

import com.wrp.roofmap.model.Point;

public abstract interface AbstractReverseGeocoder {
	public List<Point> doReverseParsing(String address);
	public String constructReverseUrl(String address);
}
