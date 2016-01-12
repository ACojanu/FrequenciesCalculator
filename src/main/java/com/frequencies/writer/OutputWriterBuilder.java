package com.frequencies.writer;

import java.io.FileNotFoundException;
import java.util.List;

import com.frequencies.calc.FreqDataProcessor;
import com.frequencies.calc.reader.FileDataParser;

/**
  * This class use a build method which return a valid output
 */
public class OutputWriterBuilder {

	/**
	 * @param path is the path of text file
	 * @return an OutputWriter object
	 */
	public OutputWriter build(String path) {
	
		FileDataParser fdp = new FileDataParser(path);
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
