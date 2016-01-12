package com.frequencies.calc.writer;

import java.util.List;

import org.slf4j.LoggerFactory;

import com.frequencies.calc.MainApp;

/**
 * This class have methods which return or display the final result
 */

public class OutputWriter {
	
	private List<Integer> outputItems;
	final static org.slf4j.Logger loggerSlf4j = LoggerFactory.getLogger(MainApp.class);
	
	/**
	 * Constructor with a parameter
	 * @param outputItems
	 */
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
		else {
			final String message = outputItems.toString();
			loggerSlf4j.trace(message);
			loggerSlf4j.debug(message);
			loggerSlf4j.info(message);
		}
	}
	/**
	 * @return the final array for unit test 
	 */
	public List<Integer> getOutputItems() {
		return outputItems;
	}
}
