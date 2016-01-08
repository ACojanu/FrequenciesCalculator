package com.frequencies.calc;

import java.io.FileNotFoundException;

/**
 * 
 */
public class MainApp 
{
	private static String path = "src/main/resources/input.txt";
	
    public static void main( String[] args ) throws FileNotFoundException
    {
    	OutputWriterBuilder b = new OutputWriterBuilder();
    	OutputWriter outputWriter = b.build(path);//create path constant here; if param is passed via command line, overwrite default path constant
    	outputWriter.write();
    }
}
