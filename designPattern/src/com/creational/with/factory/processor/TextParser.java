package com.creational.with.factory.processor;

import java.util.List;

public class TextParser implements Parser {

	@Override
	public List<com.creational.without.factory.processor.Records> parse() {
		System.out.println("parsing  text file ");
		return null;
	}

}
