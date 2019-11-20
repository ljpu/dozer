package com.example.howtodoinjava.dozer.converters;

import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerConverter;

public class UpperCaseConverter extends DozerConverter<String, String> 
{
	public UpperCaseConverter() {
		super(String.class, String.class);
	}

	@Override
	public String convertFrom(String source, String destination) {
		if (source != null) {
			return StringUtils.upperCase(source);
		}
		return null;
	}

	@Override
	public String convertTo(String source, String destination) {
		return convertTo(source, destination);
	}
}
