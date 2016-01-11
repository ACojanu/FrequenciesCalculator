package com.frequencies.calc;

import java.util.List;

import org.apache.log4j.Logger;
import org.slf4j.*;

/**
 * This class have methods which return or display the final result
 */

public class OutputWriter {
	
	private List<Integer> outputItems;
	final static Logger loggerLog4J = Logger.getLogger(MainApp.class);
	final static org.slf4j.Logger loggerSlf4j = LoggerFactory.getLogger(MainApp.class);

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
	
	public void listWithLog4J(List<Integer> listToPrint) {
		
		if(loggerLog4J.isDebugEnabled()){
			loggerLog4J.debug(listToPrint);
		}
		
		if(loggerLog4J.isInfoEnabled()){
			loggerLog4J.info(listToPrint);
		}
	}	
	/**
	 * This method display the result using Slf4j
	 * @param listToPrint is the final array
	 */
	public void listWithSlf4J(List<Integer> listToPrint) {
		final String message = listToPrint.toString();
		loggerSlf4j.trace(message);
		loggerSlf4j.debug(message);
		loggerSlf4j.info(message);
		loggerSlf4j.warn(message);
		loggerSlf4j.error(message);
	}
}
