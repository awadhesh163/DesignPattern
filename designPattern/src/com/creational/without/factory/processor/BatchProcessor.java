package com.creational.without.factory.processor;

import java.io.File;
import java.util.List;

public class BatchProcessor {
	public void processBatch(String fileName , String  fileType) {
		File file = openFile(fileName);
		List<Records> recordsList = null;
		if(fileType.equalsIgnoreCase("text")) {
			textParsermethod(file);
		}
		if(fileType.equalsIgnoreCase("csv")) {
			csvParsermethod(file);
		}
		processRecords(recordsList);
		closeFile(file);
		
	}

	private void closeFile(File file) {
		System.out.println("closing  file");
		
	}

	private void processRecords(List<Records> recordsList) {
		System.out.println("processing Records");
		
	}

	private File openFile(String fileName) {
		System.out.println("Opening   file ");
		
		return null;
	}
	private List<Records> textParsermethod(File file){
		System.out.println("parsing  text file ");
		return null;
		
	}
	private List<Records> csvParsermethod(File file){
		System.out.println("parsing  text file ");
		return null;
		
	}

}
