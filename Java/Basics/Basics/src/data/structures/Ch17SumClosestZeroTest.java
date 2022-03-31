package data.structures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ch17SumClosestZeroTest {

	@Test
	@DisplayName("Closest Sum to Zero of { 5, 4, 3, 2, 1, -6 }")
	void test() {
		int[] array = { 5, 4, 3, 2, 1, -6 };
		int[] result = { -6, 5 };
		assertArrayEquals(result, Ch17SumClosestZero.pairWithSumClosestZero(array));
	}

	@Test
	@DisplayName("Closest Sum to Zero of { 5, 4, 3, 2, 1, 0 }")
	void test2() {
		int[] array = { 5, 4, 3, 2, 1, 0 };
		int[] result = { 0, 1 };
		assertArrayEquals(result, Ch17SumClosestZero.pairWithSumClosestZero(array));
	}

	@Test
	@DisplayName("Closest Sum to Zero of { 1 }")
	void test3() {
		int[] array = { 1 };
		int[] result = { Integer.MAX_VALUE, Integer.MAX_VALUE };
		assertArrayEquals(result, Ch17SumClosestZero.pairWithSumClosestZero(array));
	}

}
