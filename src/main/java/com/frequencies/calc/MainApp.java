package com.frequencies.calc;

import java.io.FileNotFoundException;
import com.frequencies.writer.OutputWriter;
import com.frequencies.writer.OutputWriterBuilder;

public class MainApp {
	private static String path = "src/main/resources/input.txt";
	
    public static void main( String[] args ) throws FileNotFoundException {
    	OutputWriterBuilder b = new OutputWriterBuilder();
    	if (args.length > 0 && args[0] != null) {
    		// if parameter is passed via command line, overwrite default path constant
    		path = args[0];
    	}
   		OutputWriter outputWriter = b.build(path);
   		outputWriter.write();
    }
}
