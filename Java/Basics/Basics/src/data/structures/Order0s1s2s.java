package data.structures;
/**
 * Separate 0's, 1's, and 2's in an array, code for YouTube video CH22. Case with three indexes in the
 * same array. 
 */

import java.util.Arrays;

public class Order0s1s2s {

	public static void main(String[] args) {
		int[] array = { 1, 0, 2, 0, 0, 1, 2, 2, 1, 0, 0 };

		orderZeroOneTwo(array);
		System.out.println(Arrays.toString(array));

	}

	public static void orderZeroOneTwo(int[] array) {
		int low = 0;
		int middle = 0;
		int high = array.length - 1;
		int current;

		while (middle <= high) {
			current = array[middle];
			if (current == 0) { // swap to zero's segment
				array[middle] = array[low];
				array[low] = current;
				low++;
				middle++;
			} else if (current == 2) { // swap to two's segment
				array[middle] = array[high];
				array[high] = current;
				high--;
			} else if (current == 1) {
				middle++;
			}
		}

	}

}
