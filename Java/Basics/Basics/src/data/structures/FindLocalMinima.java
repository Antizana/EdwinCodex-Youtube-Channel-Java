package data.structures;

/**
 * Find a Local minimum in an array, code for YouTube video CH25. 
 */

public class FindLocalMinima {

	public static void main(String[] args) {

		int[] array = {10, 5, 3, 6, 13, 16, 7};
		findLocalMinima(array);
		
		int[] array2 = {11,12,13,14};
		findLocalMinima(array2);

		int[] array3 = {10};
		findLocalMinima(array3);

		int[] array4 = {8, 6};
		findLocalMinima(array4);
}

	private static final String INDEXSTR = "Index: ";
	private static final String VALUESTR = " Value: ";
	
	public static int findLocalMinima(int[] array) {
		int minimum = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];
				index = i;
			} else if(array[i] > minimum) {
				index = i-1;
				break;
			}
		}
		System.out.println(INDEXSTR + index + VALUESTR + minimum);
		return index;
	}
	
	public static int findlocalMinimaBinarySearch(int[] array) {
		int low = 0;
		int high = array.length - 1;
		int n = array.length - 1;
		int mid = (low + high)/2;
		
		if (n < 0 ) return -1;
		
		while(low <= high) {
			if (low == mid && mid == high) return mid;
			if(mid == low && mid < high && array[mid] < array[mid+1] || low < mid && mid == high &&  array[mid] < array[mid-1] || mid > low && mid < high && array[mid-1] > array[mid] && array[mid] < array[mid+1] ) {
				return mid;
			} else if(low < mid && array[mid - 1] < array[mid]) {
				high = mid-1 ;
			} else {
				low = mid+1;
			}
			mid = (low + high)/2;
		}
		return -1;
	}
}
