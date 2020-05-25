package com.creational.with.factory.processor;

import java.io.File;
import java.util.List;

import com.creational.without.factory.processor.Records;

public abstract class BatchProcessor {
	
	public void processBatch(String fileName ) {
		File file = openFile(fileName);
		
		Parser parser = createParser();
		List<Records> recordsList = parser.parse();
		processRecords(recordsList);
		closeFile(file);
		
	}

	public abstract Parser createParser();

	private File openFile(String fileName) {
		System.out.println("Opening   file ");
		return null;
	}
	private void closeFile(File file) {
		System.out.println("closing  file");
		
	}

	private void processRecords(List<Records> recordsList) {
		System.out.println("processing Records");
		
	}

}
