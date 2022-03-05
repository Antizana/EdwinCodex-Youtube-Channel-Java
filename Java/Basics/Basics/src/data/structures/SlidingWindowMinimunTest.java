package data.structures;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SlidingWindowMinimunTest {

	@Test
	@DisplayName("Minimuns in {2,6,-1,2,4,1,-6,5}")
	void test() {
		int[] array = { 2, 6, -1, 2, 4, 1, -6, 5 };
		int[] result = {-1, -1, -1, 1, -6, -6};
		
		assertArrayEquals(result, SlidingWindowMinimun.slidingWindowMinimun(array, 3));
		
	}

	@Test
	@DisplayName("Minimuns in {2,6,-1}")
	void test2() {
		int[] array = { 2, 6, -1 };
		int[] result = {-1};
		
		assertArrayEquals(result, SlidingWindowMinimun.slidingWindowMinimun(array, 3));
		
	}

	@Test
	@DisplayName("Minimuns in { 1, 2, 3, 4, 5, 6, 7 }")
	void test3() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int[] result = { 1, 2, 3, 4, 5 };
		
		assertArrayEquals(result, SlidingWindowMinimun.slidingWindowMinimun(array, 3));
		
	}

	@Test
	@DisplayName("Minimuns in { 4, 4, 4, 4, 4, 4, 4 }")
	void test4() {
		int[] array = { 4, 4, 4, 4, 4, 4, 4 };
		int[] result = { 4, 4, 4, 4, 4 };
		
		assertArrayEquals(result, SlidingWindowMinimun.slidingWindowMinimun(array, 3));
		
	}

}
