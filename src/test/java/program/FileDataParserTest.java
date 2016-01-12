package program;

import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.frequencies.calc.reader.FileDataParser;

public class FileDataParserTest {
	
	private final List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
	private final String path = "src/main/resources/input.txt";

	@Test
	public void fileDataParserTest(){
		FileDataParser fdp = new FileDataParser(path);
		try {
			assertEquals(inputList, fdp.doParse());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
