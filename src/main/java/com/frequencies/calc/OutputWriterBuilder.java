package com.frequencies.calc;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.frequencies.calc.parser.FileDataParser;

public class OutputWriterBuilder {

	/**
	 * 
	 * @param path is the path of txt file
	 * @return an OutputWriter object
	 */
	public OutputWriter build(String path){
	
		FileDataParser fdp = new FileDataParser(path);	
		System.out.println(fdp);
		FreqDataProcessor freqData = new FreqDataProcessor();
		List<Integer> output = null;
			try {
				output = freqData.doProccessFreq(fdp.doParse());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		return new OutputWriter(output);
	}
}
