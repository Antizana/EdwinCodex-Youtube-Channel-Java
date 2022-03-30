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

	public static void findLocalMinima(int[] array) {
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
		System.out.println("Index: " + index + " Value: " + minimum); 
	}
}
