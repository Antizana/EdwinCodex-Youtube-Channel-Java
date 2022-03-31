/**
 * Find subarrays with given sum in an array, code for YouTube video CH26. 
 */
package data.structures;

import java.util.LinkedList;

public class Ch26FindSumInArray {

	public static void main(String[] args) {
		int[] array = { 2, 3, 6, 4, 9, 0, 11 };
		
		findSumInArray(array, 9);
	}

	public static void findSumInArray(int[] array, int num) {
		LinkedList<Integer> queue = new LinkedList<>();
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			while (!queue.isEmpty() && sum + array[i] > num) {
				sum -= array[queue.getFirst()];
				queue.removeFirst();
			}
			
			queue.addLast(i);
			sum += array[i];
			
			if (sum == num) {
				System.out.println("Starting index: " + queue.getFirst() + " Ending index: " + queue.getLast());
			}

		}

	}

}
