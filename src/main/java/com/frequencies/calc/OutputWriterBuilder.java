package com.frequencies.calc;

import java.io.FileNotFoundException;
import java.util.List;

import com.frequencies.calc.parser.FileDataParser;

/**
  * This class use a build method which return a valid output
 */
public class OutputWriterBuilder {

	/**
	 * @param path is the path of text file
	 * @return an OutputWriter object
	 */
	public OutputWriter build(String path){
	
		OutputWriter owb = new OutputWriter();
		FileDataParser fdp = new FileDataParser(path);	
		FreqDataProcessor freqData = new FreqDataProcessor();
		List<Integer> output = null;
			try {
				output = freqData.doProccessFreq(fdp.doParse());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		owb.listWithLog4J(output);
		owb.listWithSlf4J(output);
		return new OutputWriter(output);
	}
}
