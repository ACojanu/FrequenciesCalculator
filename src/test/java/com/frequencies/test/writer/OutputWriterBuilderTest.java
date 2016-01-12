package com.frequencies.test.writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import com.frequencies.calc.writer.OutputWriter;
import com.frequencies.calc.writer.OutputWriterBuilder;

public class OutputWriterBuilderTest {

	private final List<Integer> list = new ArrayList<Integer>(Arrays.asList(6, 2, 1, 0, 0, 0, 1, 0, 0, 0));
	private final String path = "src/main/resources/input.txt";
	
	@Test
	public void outputWriterBuilderTest() {
		OutputWriterBuilder owb = new OutputWriterBuilder();
		OutputWriter ow = owb.build(path);
		
		assertNotNull(ow.getOutputItems());
		assertEquals(list, ow.getOutputItems());
	}
}
