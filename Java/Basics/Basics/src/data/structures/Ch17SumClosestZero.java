package data.structures;

import java.util.Arrays;

/**
 * Sum closest Zero code for YouTube video CH17. Case with two indexes in the
 * same array. Differentiate mutability and immutability
 */

public class Ch17SumClosestZero {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, -6 };
		int[] clonedArray = array.clone();
		int[] sortedArray = pairWithSumClosestZero(clonedArray);
		System.out.println(Arrays.toString(sortedArray));
		System.out.println("Original array was mutated: " + Arrays.toString(clonedArray));

		System.out.println(Arrays.toString(pairWithSumClosestZero(array.clone())));
		System.out.println("Original array was non mutated: " + Arrays.toString(array));

	}

	public static int[] pairWithSumClosestZero(int[] array) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		int minSum = Integer.MAX_VALUE;
		int closest1 = Integer.MAX_VALUE;
		int closest2 = Integer.MAX_VALUE;
		
		while (left < right) {
			if (Math.abs(array[left] + array[right]) < Math.abs(minSum)) { // The current elements have a new minimal sum
				minSum = array[left] + array[right];
				closest1 = array[left];
				closest2 = array[right];
			}
			if (minSum > 0)
				right--;
			else
				left++;
		}
		return new int[] {closest1, closest2};
	}
}
