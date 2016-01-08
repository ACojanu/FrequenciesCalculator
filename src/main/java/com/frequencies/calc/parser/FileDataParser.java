package com.frequencies.calc.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDataParser {

	private String path;

	public FileDataParser(String path) {
		this.path = path;
	}

	/**
	 * salesDataFile object to read from file
	 * salesData list populated with data from file
	 * Return a list 
	 */
	public ArrayList<Integer> doParse() throws FileNotFoundException {
		
		Scanner salesDataFile = new Scanner(new File(path));
		ArrayList<Integer> salesData = new ArrayList<Integer>();
		 while(salesDataFile.hasNextInt()) {
	            salesData.add(salesDataFile.nextInt());
	        }
	    salesDataFile.close();
		return salesData;
	}
	
}
