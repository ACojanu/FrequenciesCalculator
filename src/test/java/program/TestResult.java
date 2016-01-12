package program;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.frequencies.calc.FreqDataProcessor;
import com.frequencies.calc.reader.FileDataParser;
import com.frequencies.calc.writer.OutputWriter;
import com.frequencies.calc.writer.OutputWriterBuilder;

/**
 * In this class are made tests for all classes from this project
 */

public class TestResult {
	
	private final List<Integer> list = new ArrayList<Integer>(Arrays.asList(6,2,1,0,0,0,1,0,0,0));
	private final List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
	private final String path = "src/main/resources/input.txt";
	
	@Test
	public void testList() {
		OutputWriterBuilder owb = new OutputWriterBuilder();
		OutputWriter ow = owb.build(path);
		
		FileDataParser fdp = new FileDataParser(path);
	    try {
			assertEquals(inputList, fdp.doParse());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
	    FreqDataProcessor freqDataPr = new FreqDataProcessor();
	    assertEquals(list, freqDataPr.doProccessFreq(inputList));
		
	    assertNotNull(ow.getOutputItems());
		assertEquals(list, ow.getOutputItems());
	}

}
