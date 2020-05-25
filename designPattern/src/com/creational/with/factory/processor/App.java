package com.creational.with.factory.processor;

public class App {

	public static void main(String[] args) {
		BatchProcessorFactory BatchProcessorFactory = new BatchProcessorFactory();
		BatchProcessor BatchProcessor =BatchProcessorFactory.getBatchProcessorObject(BatchType.CSV);
		BatchProcessor.processBatch("myfile");

	}

}
