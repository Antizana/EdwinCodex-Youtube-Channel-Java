package data.structures;

/**
 * FindSecondLargestNumber sample code for Youtube video CH14
 */

public class Ch14FindSecondLargestNumber {

	public static void main(String[] args) {

		int[] array = { 7, 5, 6, 1, 4, 2 };
		System.out.println(findSecondLargest(array));
	}

	public static int findSecondLargest(int[] array) {
		int highestNumber = 0;
		int secondHighestNumber = highestNumber;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highestNumber) {
				secondHighestNumber = highestNumber;
				highestNumber = array[i];
			} else {
				if (array[i] > secondHighestNumber)
					secondHighestNumber = array[i];
			}
		}

		return secondHighestNumber;
	}
}
