package com.creational.with.factory.processor;

public class TextBatchProcessor  extends BatchProcessor {

	@Override
	public Parser createParser() {
		return new TextParser();
		
	}

}
