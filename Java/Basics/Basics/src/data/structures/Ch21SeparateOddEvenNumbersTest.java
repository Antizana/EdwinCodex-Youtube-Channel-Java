package data.structures;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ch21SeparateOddEvenNumbersTest {

	@Test
	@DisplayName("Separate Odd and Even {12, 17, 70, 15, 22, 65, 21, 90}")
	void test() {
		List<Integer> array = new ArrayList<>(Arrays.asList(12, 17, 70, 15, 22, 65, 21, 90));
		List<Integer> result = Ch21SeparateOddEvenNumbers.separateOddAndEvenNumbers(array);
		List<Integer> expected = new ArrayList<>(Arrays.asList(12, 90, 70, 22, 15, 65, 21, 17));
		assertArrayEquals(expected.toArray(), result.toArray());
	}

}
