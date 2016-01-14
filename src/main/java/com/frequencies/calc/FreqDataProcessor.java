package com.frequencies.calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * In this class is the algorithm which calculate the frequencies of number appearance in an array
 * The number in the second line is the number of times in which the first line number show up in the second line
 */
public class FreqDataProcessor {

	/**
	 * Call the method which start the process to calculate frequencies
	 * @param input is the list from file.
	 * @return the final list
	 */
	public List<Integer> doProccessFreq(List<Integer> input) {	
		List<Integer> dest = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		calculateFrequencies(input, dest);
		return dest;
	}
	
	/**
	 * Here start the process to calculate the frequencies
	 * @param src is the list from file
	 * @param dest is the list which at the beginning is populated with 0
	 * @param len is the length of both lists
	 */
	private static void calculateFrequencies(List<Integer> src, List<Integer> dest) {
		boolean valid = ResultFrequenciesValidator.validate(src, dest);
		while (!valid) {
			findFrequencies(src, dest);
			valid = ResultFrequenciesValidator.validate(src, dest);
		}
	}
	
	/**
	 * Find if elements from the first list are in the second one, counter them and modify the destination list
	 * @param src is the list from file
	 * @param dest is the list that will became the final list
	 * @param len is the length of both lists
	 */
	private static void findFrequencies(List<Integer> src, List<Integer> dest) {
		for (int i = 0; i < src.size(); i++) {
			int count = 0;
			for (int j = 0; j < src.size(); j++) {
				if (src.get(i) == dest.get(j)) {
					count++;
			    }
			}
			dest.set(i, count);
		}
	}
}
