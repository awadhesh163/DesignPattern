package com.creational.with.factory.processor;



public class BatchProcessorFactory {
	
	 BatchProcessor getBatchProcessorObject(BatchType BatchType) {
		
		 switch (BatchType) {
         case TEXT:
             return new TextBatchProcessor();
         case CSV:
             return new CsvBatchProcessor();

             default:
                 return null;
     }
		
		
	}

}
