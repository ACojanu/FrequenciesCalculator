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
	 * @param input is the list from file.
	 * @return the final list
	 */
	public List<Integer> doProccessFreq(List<Integer> input){	
		List<Integer> dest = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
		int len = 10;
		calculateFrequencies(input, dest, len);
		System.out.println(dest);
		return dest;
	}
	
	/**
	 * Start the process
	 * @param src is the list from file
	 * @param dest is the list which at the beginning is populated with 0
	 * @param len is the length of both lists
	 */
	static void calculateFrequencies(List<Integer> src, List<Integer> dest, int len) {
		while (true){
			findFrequencies(src, dest, len);
			System.out.println(dest);
			if (!verifyFrequencies(src, dest, len)) {
			    continue;
			}
			else {
			    break;
			}
		}
	}
	
	/**
	 * Find if elements from the first list are in the second one, counter them and modify the destination list
	 * @param src is the list from file
	 * @param dest is the list that will became the final list
	 * @param len is the length of both lists
	 */
	public static void findFrequencies(List<Integer> src, List<Integer> dest, int len){
		for (int i=0; i<len; i++) {
			int count = 0;
			for (int j=0; j<len; j++) {
				if (src.get(i) == dest.get(j)) {
					count++;
			    }
			}
			dest.set(i, count);
		}
	}
	
	/**
	 * Verify is elements from first list are in the second one and counter them
	 * @param src is the list from file
	 * @param dest is the list that will became the final list
	 * @param len is the length of both lists
	 * @return true or false
	 */
	public static boolean verifyFrequencies(List<Integer> src, List<Integer> dest, int len){
		int i=0;
		while(i<len) {
			int count = 0;
			for (int j=0; j<len; j++) {
			    if (src.get(i) == dest.get(j)) {
			    	count++;
			    }
			}
			if (dest.get(i) != count) {
			    return false;
			}
			i++;
		}
		return true;
	}

}
