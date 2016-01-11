package com.frequencies.calc;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * This class have methods which return or display the final result
 */

public class OutputWriter {
	
	private List<Integer> outputItems;
	final static Logger logger = Logger.getLogger(MainApp.class);

	public OutputWriter() {
		
	}
	
	public OutputWriter(List<Integer> outputItems) {
		this.outputItems = outputItems;
	}
	
	/**
	 * The method to display in console the final array
	 */
	public void write() {
		if (outputItems == null) {
			return;
		}
		System.out.print("[ ");		
		for (Integer item : outputItems) {
			System.out.print(item + " ");
		}
		System.out.print("]");
	}
	
	/**
	 * @return the final array for unit test 
	 */
	public List<Integer> getOutputItems(){
		return outputItems;
	}
	
	/**
	 * This method display the result using log4j
	 * @param listToPrint is the final array
	 */
	
	public void runMe(List<Integer> listToPrint){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is the good output : " + listToPrint);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + listToPrint);
		}
		
		logger.warn("This is warn : " + listToPrint);
		logger.error("This is error : " + listToPrint);
		logger.fatal("This is fatal : " + listToPrint);
		
	}
}
