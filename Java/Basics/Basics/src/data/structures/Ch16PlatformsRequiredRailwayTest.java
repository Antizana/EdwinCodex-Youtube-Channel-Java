package data.structures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ch16PlatformsRequiredRailwayTest {

	@Test
	@DisplayName("Calculate platforms in arrivals {030, 100 , 200, 230, 550} departures {130}")
	void test() {
		int[] arrivals = { 030, 100, 200, 230, 550 };
		int[] departures = { 130 };

		assertEquals(4, Ch16PlatformsRequiredRailway.calculatePlatforms(arrivals, departures));
	}

	@Test
	@DisplayName("Calculate platforms in arrivals {030, 100 , 200, 230, 550} departures {130, 230}")
	void test2() {
		int[] arrivals = { 030, 100, 200, 230, 550 };
		int[] departures = { 130, 230 };

		assertEquals(3, Ch16PlatformsRequiredRailway.calculatePlatforms(arrivals, departures));
	}

	@Test
	@DisplayName("Calculate platforms in arrivals {030, 100 , 200, 230, 550} departures {}")
	void test3() {
		int[] arrivals = { 030, 100, 200, 230, 550 };
		int[] departures = { };

		assertEquals(5, Ch16PlatformsRequiredRailway.calculatePlatforms(arrivals, departures));
	}

	@Test
	@DisplayName("Calculate platforms in arrivals {030, 100 , 200, 230, 550} departures { 110, 300, 220, 230, 315, 600 }")
	void test4() {
		int[] arrivals = { 030, 100, 200, 230, 550 };
		int[] departures = { 110, 300, 220, 230, 315, 600 };

		assertEquals(2, Ch16PlatformsRequiredRailway.calculatePlatforms(arrivals, departures));
	}

}
