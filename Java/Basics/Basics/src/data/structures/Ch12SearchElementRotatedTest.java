package data.structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ch12SearchElementRotatedTest {

	@Test
	@DisplayName("Find 5 in { 16, 19, 20, 26, 2, 5, 8, 10 }")
	void test() {
		int[] array = { 16, 19, 20, 26, 2, 5, 8, 10 };
		assertEquals(5, Ch12SearchElementRotated.searchElement(array, 5));
	}

	@Test
	@DisplayName("Find 21 in { 16, 19, 20, 26, 2, 5, 8, 10 }")
	void test2() {
		int[] array = { 16, 19, 20, 26, 2, 5, 8, 10 };
		assertEquals(-1, Ch12SearchElementRotated.searchElement(array, 21));
	}

	@Test
	@DisplayName("Find 16 in { 16, 19, 20, 26, 2, 5, 8, 10 }")
	void test3() {
		int[] array = { 16, 19, 20, 26, 2, 5, 8, 10 };
		assertEquals(0, Ch12SearchElementRotated.searchElement(array, 16));
	}
	@Test
	@DisplayName("Find 20 in { 10, 16, 19, 20, 26, 2, 5, 8 }")
	void test6() {
		int[] array = { 10, 16, 19, 20, 26, 2, 5, 8 };
		assertEquals(3, Ch12SearchElementRotated.searchElement(array, 20));
	}

	@Test
	@DisplayName("Find 26 in { 10, 16, 19, 20, 26, 2, 5, 8 }")
	void test5() {
		int[] array = { 10, 16, 19, 20, 26, 2, 5, 8 };
		assertEquals(4, Ch12SearchElementRotated.searchElement(array, 26));
	}
	
}
