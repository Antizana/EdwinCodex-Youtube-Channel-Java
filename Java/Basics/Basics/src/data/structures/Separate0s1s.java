package data.structures;
/**
 * Separate 0's and 1's in an array, code for YouTube video CH20. Case with two indexes in the
 * same array. Differentiate mutability and immutability
 */

import java.util.Arrays;

public class Separate0s1s {

	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0 };
		
		separateZeroesOnes(array);
		System.out.println(Arrays.toString(array));

	}

	public static void separateZeroesOnes(int[] array) {
		int left = 0;
		int right = array.length - 1;
		int temp;
		
		while (left < right ) {
			if (array[left] > array[right]) {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
			} else if(array[left] == 0) {
				left++;
			} else if (array[right] == 1) {
				right--;
			}
		}
	}

}
