package data.structures;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ch20Separate0s1sTest {

	@Test
	@DisplayName("Reorder {0,1,0,0,1,1,1,0,1}")
	void test() {
		int[] array = {0,1,0,0,1,1,1,0,1};
		int[] result = {0,0,0,0,1,1,1,1,1}; 
		Ch20Separate0s1s.separateZeroesOnes(array);
		assertArrayEquals(result, array);
	}

	@Test
	@DisplayName("Reorder {0,1,1,1,0,1,0,0,1}")
	void test1() {
		int[] array = {0,1,1,1,0,1,0,0,1};
		int[] result = {0,0,0,0,1,1,1,1,1}; 
		Ch20Separate0s1s.separateZeroesOnes(array);
		assertArrayEquals(result, array);
	}

	@Test
	@DisplayName("Reorder {1,1,1,1,0,1,1,1,1}")
	void test2() {
		int[] array = {1,1,1,1,0,1,1,1,1};
		int[] result = {0,1,1,1,1,1,1,1,1}; 
		Ch20Separate0s1s.separateZeroesOnes(array);
		assertArrayEquals(result, array);
	}

	@Test
	@DisplayName("Reorder {1,0,0,0,0,0,0,0,0}")
	void test3() {
		int[] array = {1,0,0,0,0,0,0,0,0};
		int[] result = {0,0,0,0,0,0,0,0,1}; 
		Ch20Separate0s1s.separateZeroesOnes(array);
		assertArrayEquals(result, array);
	}

}
