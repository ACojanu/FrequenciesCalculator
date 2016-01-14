package com.frequencies.calc;

import java.util.List;

/**
 *	This class validate if the list is ok for the next step
 */
public class ResultFrequenciesValidator {
	
private List<Integer> listToValidate;
	
	public ResultFrequenciesValidator(List<Integer> listToValidate) {
		this.setListToValidate(listToValidate);
	}

	public List<Integer> getListToValidate() {
		return listToValidate;
	}

	public void setListToValidate(List<Integer> listToValidate) {
		this.listToValidate = listToValidate;
	}

	/**
	 * Verify if elements from first list are in the second one and counter them
	 * @param src is the list from file
	 * @param dest is the list that will became the final list
	 */
	public static boolean validate(List<Integer> src, List<Integer> dest) {
		int i = 0;
		while (i < src.size()) {
			int count = 0;
			for (int j = 0; j < src.size(); j++) {
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
