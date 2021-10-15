package Assignment_22_09_21;

import java.util.Arrays;

public class TddFourthLargestDemo {

	public int getFourthLargest(int[] inputArr, int index) {
		try {
			if (index > inputArr.length) {
				throw new NegativeArraySizeException("Index value cannot be negative");
			}
			if (inputArr.length < index) {
				return 0;
			}
			Arrays.sort(inputArr);
			return inputArr[inputArr.length - index];
		} catch (NegativeArraySizeException e) {
			e.getMessage();
		}
		return 0;
	}

}
