package com.creational.with.factory.processor;

import java.util.List;

public class CsvParser implements Parser {

	@Override
	public List<com.creational.without.factory.processor.Records> parse() {
		System.out.println("parsing  csv file ");
		return null;
	}

}
