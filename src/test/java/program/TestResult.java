package program;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.frequencies.calc.OutputWriter;
import com.frequencies.calc.OutputWriterBuilder;

public class TestResult {
	
	private final List<Integer> list = new ArrayList<Integer>(Arrays.asList(6,2,1,0,0,0,1,0,0,0));
	private final String path = "src/main/resources/input.txt";
	
	@Test
	public void testList(){
		OutputWriterBuilder owb = new OutputWriterBuilder();
		OutputWriter ow = owb.build(path);
		
		assertEquals(list, ow.getOutputItems());
	}

}
