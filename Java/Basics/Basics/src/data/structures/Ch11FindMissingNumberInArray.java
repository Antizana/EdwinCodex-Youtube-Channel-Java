package data.structures;

/**
 * FindMissingNumberInArray sample code for Youtube video. CH11
 */

public class Ch11FindMissingNumberInArray {

	public static void main(String[] args) {
//		int[] arr1 = {7,5,6,1,4,2};
		int[] arr1 = { 7, 5, 3, 1, 4, 2, 6 };
		int missingNumber = findMissingIter(arr1);
		System.out.println("Missing Number: " + missingNumber);
		missingNumber = findMissingNumber(arr1);
		System.out.println("Missing Number: " + missingNumber);
	}

	public static int findMissingIter(int[] arr1) {
		int[] arr2 = new int[arr1.length + 1];
		for (int i = 0; i < arr1.length; i++) {
			arr2[arr1[i] - 1] = arr1[i];
		}
		int count = 0;
		int missingNumber = -1;
		while (count < arr2.length) {
			if (arr2[count] == 0) {
				missingNumber = count + 1;
				break;
			}
			count++;
		}
		return (missingNumber);
	}

	public static int findMissingNumber(int[] arr1) {
		int n = arr1.length + 1;
		int sumNumbers = (n * (n + 1)) / 2;
		int sumArr1 = 0;
		for (int i : arr1)
			sumArr1 += i;
		return (sumNumbers - sumArr1);
	}
}
