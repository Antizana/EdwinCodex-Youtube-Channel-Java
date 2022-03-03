package data.structures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	@DisplayName("Find 6 in { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }")
	void find6() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		assertEquals(6, BinarySearch.binarySearchRecursive(array, 6, 0, array.length - 1));
	}

	@Test
	@DisplayName("Find 6 in an odd array { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 }")
	void find6InOddArray() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 };
		assertEquals(6, BinarySearch.binarySearchRecursive(array, 6, 0, array.length - 1));
	}

	@Test
	@DisplayName("Find duplicate 5 in { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }")
	void find5Duplicate() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		assertEquals(4, BinarySearch.binarySearchRecursive(array, 5, 0, array.length - 1));
	}

	@Test
	@DisplayName("Find non existing 15 in { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }")
	void findNonExisting() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		assertEquals(-1, BinarySearch.binarySearchRecursive(array, 15, 0, array.length - 1));
	}

	@Test
	@DisplayName("Find in arrray of 1 element { 5 }")
	void find1Element() {
		int[] array = { 5 };
		assertEquals(0, BinarySearch.binarySearchRecursive(array, 5, 0, array.length - 1));
	}

	@Test
	@DisplayName("Find in null arrray { }")
	void findNullArray() {
		int[] array = { };
		assertThrows(RuntimeException.class, () -> BinarySearch.binarySearchRecursive(array, 5, 0, array.length - 1));
	}

	/**
	 * Tests for binarySearchIterative 
	 */
	@Test
	@DisplayName("Find 6 in { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 } Iterative")
	void find6Iter() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		assertEquals(6, BinarySearch.binarySearchIterative(array, 6));
	}

	@Test
	@DisplayName("Find 6 in an odd array { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 } Iterative")
	void find6InOddArrayIter() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 };
		assertEquals(6, BinarySearch.binarySearchIterative(array, 6));
	}

	@Test
	@DisplayName("Find duplicate 5 in { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 } Iterative")
	void find5DuplicateIter() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		assertEquals(4, BinarySearch.binarySearchIterative(array, 5));
	}

	@Test
	@DisplayName("Find non existing 15 in { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 } Iterative")
	void findNonExistingIter() {
		int[] array = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
		assertEquals(-1, BinarySearch.binarySearchIterative(array, 15));
	}

	@Test
	@DisplayName("Find in arrray of 1 element { 5 } Iterative")
	void find1ElementIter() {
		int[] array = { 5 };
		assertEquals(0, BinarySearch.binarySearchIterative(array, 5));
	}

	@Test
	@DisplayName("Find in null arrray { } Iterative")
	void findNullArrayIter() {
		int[] array = { };
		assertEquals(-1, BinarySearch.binarySearchIterative(array, 5));
	}

}
