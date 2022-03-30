package data.structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindLocalMinimaTest {

	@Test
	@DisplayName("Local Minimum of {10, 5, 3, 6, 13, 16, 7}")
	void test() {
		int[] array = {10, 5, 3, 6, 13, 16, 7};
		assertEquals(FindLocalMinima.findLocalMinima(array), 2);
	}

	@Test
	@DisplayName("Local Minimum of {11,12,13,14}")
	void test2() {
		int[] array = {11,12,13,14};
		assertEquals(FindLocalMinima.findLocalMinima(array), 0);
	}

	@Test
	@DisplayName("Local Minimum of {10}")
	void test3() {
		int[] array = {10};
		assertEquals(FindLocalMinima.findLocalMinima(array), 0);
	}

	@Test
	@DisplayName("Local Minimum of {8, 6}")
	void test4() {
		int[] array = {8, 6};
		assertEquals(FindLocalMinima.findLocalMinima(array), 1);
	}

}
