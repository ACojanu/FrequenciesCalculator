package com.freqeuncies.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.frequencies.calc.FreqDataProcessor;

public class FreqDataProcessorTest {

	private final List<Integer> list = new ArrayList<Integer>(Arrays.asList(6, 2, 1, 0, 0, 0, 1, 0, 0, 0));
	private final List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
	
	@Test
	public void freqDataProcessorTest() {
		FreqDataProcessor freqDataPr = new FreqDataProcessor();
	    assertEquals(list, freqDataPr.doProccessFreq(inputList));
	}
}
