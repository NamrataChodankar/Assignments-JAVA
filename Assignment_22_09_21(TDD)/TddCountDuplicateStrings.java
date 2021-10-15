package Assignment_22_09_21;

import java.util.HashSet;
import java.util.Set;

public class TddCountDuplicateStrings {
	public int getDuplicateCount(String[] inputArr) {
		int count=0;
		if(inputArr.length==1 || inputArr.length==0) {
			return count;
		}
		Set<String> set=new HashSet<>();
		for (String string : inputArr) {
			boolean add = set.add(string);
			if(add==false) {
				count++;
			}
		}
		return count;
	}
}
