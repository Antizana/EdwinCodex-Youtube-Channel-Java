/**
 * Find a Local minimum in an array, code for YouTube video CH25.
 * Tests 
 */

package data.structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class Ch25FindLocalMinimaTest {

	@Nested
	class  FindLocalMinimaTests{
		@Test
		@DisplayName("Local Minimum of {10, 5, 3, 6, 13, 16, 7}")
		void test() {
			int[] array = {10, 5, 3, 6, 13, 16, 7};
			assertEquals(2, Ch25FindLocalMinima.findLocalMinima(array));
		}

		@Test
		@DisplayName("Local Minimum of {11,12,13,14}")
		void test2() {
			int[] array = {11,12,13,14};
			assertEquals(0, Ch25FindLocalMinima.findLocalMinima(array));
		}

		@Test
		@DisplayName("Local Minimum of {10}")
		void test3() {
			int[] array = {10};
			assertEquals(0, Ch25FindLocalMinima.findLocalMinima(array));
		}

		@Test
		@DisplayName("Local Minimum of {8, 6}")
		void test4() {
			int[] array = {8, 6};
			assertEquals(1, Ch25FindLocalMinima.findLocalMinima(array));
		}

		@Test
		@DisplayName("Local Minimum of {}")
		void test5() {
			int[] array = {};
			assertEquals(-1, Ch25FindLocalMinima.findLocalMinima(array));
		}
		
	}
	
	@Nested 
	class FindlocalMinimaBinarySearchTests{
		@Test
		@DisplayName("Local Minimum Optimal of {10, 5, 3, 6, 13, 16, 7}")
		void testOptimal() {
			int[] array = {10, 5, 3, 6, 13, 16, 7};
			assertEquals(2, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}

		@Test
		@DisplayName("Local Minimum Optimal of {11,12,13,14}")
		void testOptimal2() {
			int[] array = {11,12,13,14};
			assertEquals(0, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}

		@Test
		@DisplayName("Local Minimum Optimal of {10}")
		void testOptimal3() {
			int[] array = {10};
			assertEquals(0, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}

		@Test
		@DisplayName("Local Minimum Optimal of {8, 6}")
		void testOptimal4() {
			int[] array = {8, 6};
			assertEquals(1, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}

		@Test
		@DisplayName("Local Minimum Optimal of {6, 8}")
		void testOptimal5() {
			int[] array = {6, 8};
			assertEquals(0, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}

		@Test
		@DisplayName("Local Minimum Optimal of {8, 6, 6, 8}")
		void testOptimal6() {
			int[] array = {8, 6, 6, 8};
			assertEquals(2, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}

		@Test
		@DisplayName("Local Minimum Optimal of {}")
		void testOptimal7() {
			int[] array = {};
			assertEquals(-1, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}

		@Test
		@DisplayName("Local Minimum Optimal of {14,13,12,11}")
		void testOptimal8() {
			int[] array = {14,13,12,11};
			assertEquals(3, Ch25FindLocalMinima.findlocalMinimaBinarySearch(array));
		}
		
	}

}
