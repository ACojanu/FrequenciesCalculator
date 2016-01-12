package com.frequencies.calc.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class return a list which is read from a text file.
 */

public class FileDataParser {

	private String path;

	/**
	 * Class constructor
	 * @param path is the path of the text file
	 */
	public FileDataParser(String path) {
		this.path = path;
	}

	/**
	 * salesDataFile object to read from file
	 * salesData list populated with data from file
	 *  
	 * @return Return a list
	 * @throws FileNotFoundException
	 */
	public List<Integer> doParse() throws FileNotFoundException {
		
		Scanner salesDataFile = new Scanner(new File(path));
		List<Integer> salesData = new ArrayList<Integer>();
		while (salesDataFile.hasNextInt()) {
			salesData.add(salesDataFile.nextInt());
	    }
	    salesDataFile.close();
		return salesData;
	}
	
}
