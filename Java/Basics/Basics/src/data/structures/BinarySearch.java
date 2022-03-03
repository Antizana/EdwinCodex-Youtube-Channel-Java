package data.structures;

/**
 * BinarySearch sample code for YouTube video.
 */

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		int[] nullArray = { };

		System.out.println(binarySearchRecursive(array, 1, 0, array.length - 1));
		System.out.println(binarySearchIterative(array, 15));
		System.out.println(binarySearchIterative(nullArray, 15));
	}

	// Found an element in a sorted array using recursion 
	public static int binarySearchRecursive(int[] array, int key, int low, int high) {
		int middle = (high + low) / 2;

		// Founded in the middle
		if (array[middle] == key)
			return middle;

		if (low > high)
			return -1;

		if (key < array[middle]) { // Search in the low array
			return binarySearchRecursive(array, key, low, middle - 1);
		} else { // Search in the high array
			return binarySearchRecursive(array, key, middle + 1, high);
		}
	}

	// Found an element in a sorted array without using recursion 
	public static int binarySearchIterative(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			// Founded in the middle
			if (key == array[middle])
				return middle;
			if (key < array[middle]) { // Will be in the low array
				high = middle - 1;
			} else 	// Will be in the high array 
				low = middle + 1;
		}
		return -1;
	}
}
