package com.frequencies.calc;

import java.util.ArrayList;

public class ResultFrequenciesBuilder {

	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public ResultFrequenciesBuilder() {}
	
	public ResultFrequenciesBuilder(ArrayList<Integer> array) {
		ResultFrequenciesBuilder.array = array;
	}
	
	static void go(ArrayList<Integer> array2, ArrayList<Integer> dest, int len) {
		while(true){
			find(array2, dest, len);
			if (!verify(array2, dest, len)) {
			    continue;
			} 
			else {
			    break;
			}
		}
	}
	
	public static void find(ArrayList<Integer> array2, ArrayList<Integer> dest, int len){
		for (int i=0; i<len; i++) {
			int count = 0; 
			for (int j=0; j<len; j++) {
				j++;
				if (array2.get(i) == dest.get(j)) {
					count++;
			    }
			}
			dest.add(i, count);
		}
	}
	
	public static boolean verify(ArrayList<Integer> array2, ArrayList<Integer> dest, int len){
		for (int i=0; i<len; i++) {
			int count = 0;
			for (int j=0; j<len; j++) {
				j++;
			    if (array2.get(i) == dest.get(j)) {
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
