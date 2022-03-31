/**
 * Separate Odd and Even Numbers in an array, code for YouTube video CH21. 
 */
package data.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch21SeparateOddEvenNumbers {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>(Arrays.asList(12, 17, 70, 15, 22, 65, 21, 90));
		List<Integer> result = separateOddAndEvenNumbers(array);
		System.out.println(result);
	}

	public static List<Integer> separateOddAndEvenNumbers(List<Integer> array) {
		List<Integer> result = new ArrayList<>(array);
		int low = 0;
		int high = result.size() - 1;
		int size = high;
		int temp = 0;
		while (low < high) {
			while(low < size && result.get(low)%2 == 0 ) low++;
			while(high > 0 && result.get(high)%2 != 0  ) high--;
			temp = result.get(high);
			result.set(high, result.get(low));
			result.set(low, temp);
			low++;
			high--;
		}
		return result;
	}
}
