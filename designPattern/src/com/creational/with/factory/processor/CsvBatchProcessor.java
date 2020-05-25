package com.creational.with.factory.processor;

public class CsvBatchProcessor  extends BatchProcessor {

	@Override
	public Parser createParser() {
		return new CsvParser();
	}

}
