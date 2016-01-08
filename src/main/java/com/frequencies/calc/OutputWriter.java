package com.frequencies.calc;

import java.util.List;

public class OutputWriter {
	
	private List<Integer> outputItems;

	public OutputWriter(List<Integer> outputItems) {
		this.outputItems = outputItems;
	}
	
	/**
	 * The method output the final array
	 */
	public void write(){
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
}
