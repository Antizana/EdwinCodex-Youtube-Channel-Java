package data.structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindSecondLargestNumberTest {

	@Test
	@DisplayName("Find Second Largest {7, 5, 6, 1, 4, 2}")
	void testFindSecondLargest76() {
		int[] array = {7, 5, 6, 1, 4, 2};
		assertEquals(6, FindSecondLargestNumber.findSecondLargest(array));
	}

	@Test
	@DisplayName("Find Second Largest {7, 5, 6, 1, 4, 8, 2}")
	void testFindSecondLargest87() {
		int[] array = {7, 5, 6, 1, 4, 8, 2};
		assertEquals(7, FindSecondLargestNumber.findSecondLargest(array));
	}
	
	@Test
	@DisplayName("Find Second Largest of empty array {}")
	void testFindSecondLargestEmpty() {
		int[] array = {};
		assertEquals(0, FindSecondLargestNumber.findSecondLargest(array));
	}

	@Test
	@DisplayName("Find Second Largest of one element array {5}")
	void testFindSecondLargestOne() {
		int[] array = {5};
		assertEquals(0, FindSecondLargestNumber.findSecondLargest(array));
	}

	@Test
	@DisplayName("Find Second Largest of equal elements array {4, 4}")
	void testFindSecondLargestEquals() {
		int[] array = {4, 4};
		assertEquals(4, FindSecondLargestNumber.findSecondLargest(array));
	}

}
