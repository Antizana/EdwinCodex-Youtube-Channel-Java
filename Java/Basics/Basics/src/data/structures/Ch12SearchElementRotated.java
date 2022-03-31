package data.structures;

/**
 * SearchElementRotated sample code for YouTube video CH12
 */

public class Ch12SearchElementRotated {

	public static void main(String[] args) {
		int[] arr = { 16, 19, 20, 26, 2, 5, 8, 10 };
		int[] arr2 = { 2, 5, 8, 10, 16, 19, 20, 26 };
		int[] arr3 = { 8, 10, 16, 19, 20, 26, 2, 5 };
		int[] arr4 = { 20, 26, 2, 5, 8, 10, 16, 19 };

		System.out.println(searchElement(arr, 5));
		System.out.println(searchElement(arr2, 5));
		System.out.println(searchElement(arr3, 5));
		System.out.println(searchElement(arr4, 5));

	}

	public static int searchElement(int[] array, int key) {
		int high = array.length - 1;
		int low = 0;
		int middle;

		while (low <= high) {
			middle = (low + high) / 2;
			if (key == array[middle]) // key founded
				return middle;
			// low array is sorted
			if (array[low] <= array[middle]) {
				if (array[low] <= key && key <= array[middle]) // key is in the low sorted array
					high = middle - 1;
				else // key is in the upper unsorted array
					low = middle + 1;
			} else { // high array is sorted
				if (array[middle] <= key && key <= array[high]) // key is in the ordered upper array
					low = middle + 1;
				else // key is in the lower unsorted array
					high = middle - 1;
			}
		}
		return -1; // not founded
	}

}