package data.structures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Order0s1s2sTest {

	@Test
	@DisplayName("Order { 1, 0, 2, 0, 0, 1, 2, 2, 1, 0, 0 }")
	void test() {
		int[] array = { 1, 0, 2, 0, 0, 1, 2, 2, 1, 0, 0 };
		int[] result = {0,0,0,0,0,1,1,1,2,2,2};
		
		Order0s1s2s.orderZeroOneTwo(array);
		assertArrayEquals(result, array);
	}

	@Test
	@DisplayName("Order { 2, 1, 0 }")
	void test2() {
		int[] array = { 2, 1, 0 };
		int[] result = { 0, 1, 2 };
		
		Order0s1s2s.orderZeroOneTwo(array);
		assertArrayEquals(result, array);
	}

	@Test
	@DisplayName("Order { 2, 1 }")
	void test3() {
		int[] array = { 2, 1 };
		int[] result = { 1, 2 };
		
		Order0s1s2s.orderZeroOneTwo(array);
		assertArrayEquals(result, array);
	}

	@Test
	@DisplayName("Order { 1 }")
	void test4() {
		int[] array = { 1 };
		int[] result = { 1 };
		
		Order0s1s2s.orderZeroOneTwo(array);
		assertArrayEquals(result, array);
	}

	@Test
	@DisplayName("Order { }")
	void test5() {
		int[] array = { };
		int[] result = { };
		
		Order0s1s2s.orderZeroOneTwo(array);
		assertArrayEquals(result, array);
	}

}
