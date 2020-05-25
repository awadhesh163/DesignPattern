package com.creational.without.factory.processor;

public class App {

	public static void main(String[] args) {
		BatchProcessor batchProcessor = new BatchProcessor();
		batchProcessor.processBatch("myfile", "text");

	}

}
