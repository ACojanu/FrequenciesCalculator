package com.frequencies.calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreqDataProcessor {

	/**
	 * @param output is the list from file.
	 * @return the final list
	 */
	public List<Integer> doProccessFreq(List<Integer> output){	
		//TODO: Add nprocess logic here
		List<Integer> destArray = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
		int len = 10;
		go(output, destArray, len);
		System.out.println(destArray);
		return destArray;
	}
	
	/**
	 * Start the process
	 * @param srcArray is the list from file
	 * @param dest is the list which at the beginning is populated with 0
	 * @param len is the length of both lists
	 */
	static void go(List<Integer> srcArray, List<Integer> dest, int len) {
		while(true){
			find(srcArray, dest, len);
			System.out.println(dest);
			if (!verify(srcArray, dest, len)) {
			    continue;
			}
			else {
			    break;
			}
		}
	}
	
	/**
	 * Find if elements from the first list are in the second one, counter them and modify the destination list
	 * @param srcArray is the list from file
	 * @param dest is the list that will became the final list
	 * @param len is the length of both lists
	 */
	public static void find(List<Integer> srcArray, List<Integer> dest, int len){
		for (int i=0; i<len; i++) {
			int count = 0;
			for (int j=0; j<len; j++) {
				if (srcArray.get(i) == dest.get(j)) {
					count++;
			    }
			}
			dest.set(i, count);
		}
	}
	
	/**
	 * Verify is elements from first list are in the second one and counter them
	 * @param srcArray is the list from file
	 * @param dest is the list that will became the final list
	 * @param len is the length of both lists
	 * @return true or false
	 */
	public static boolean verify(List<Integer> srcArray, List<Integer> dest, int len){
		for (int i=0; i<len; i++) {
			int count = 0;
			for (int j=0; j<len; j++) {
			    if (srcArray.get(i) == dest.get(j)) {
			    	count++;
			    }
			}
			if (dest.get(i) != count) {
			    return false;
			}
		}
		return true;
	}

}
