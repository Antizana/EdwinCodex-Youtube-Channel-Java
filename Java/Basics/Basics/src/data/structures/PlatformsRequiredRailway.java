package data.structures;

/**
 * Platforms Required sample code for YouTube video CH16
 * Case with two indexes in different arrays. 
 */

import java.util.Arrays;

public class PlatformsRequiredRailway {

	public static void main(String[] args) {
		int[] arrivals = { 100, 140, 150, 200, 215, 400 };
		int[] departures = { 110, 300, 220, 230, 315, 600 };

		System.out.println(calculatePlatforms(arrivals, departures));
	}

	public static int calculatePlatforms(int[] arrivals, int[] departures) {
		int maxPlatforms = 0;
		int currentPlatforms = 0;
		Arrays.sort(arrivals);
		Arrays.sort(departures);
		int totArrivals = arrivals.length;
		int totDepartures = departures.length;
		int numArrival = 0;
		int numDeparture = 0;
		int hourArrival = 0;
		int hourDeparture = 0;

		if (totDepartures == 0)
			return arrivals.length;

		while (numArrival < totArrivals && numDeparture < totDepartures) {
			hourArrival = arrivals[numArrival];
			hourDeparture = departures[numDeparture];

			if (hourArrival <= hourDeparture) { // Is first an arrival
				currentPlatforms++;
				numArrival++;
				if (currentPlatforms > maxPlatforms)
					maxPlatforms = currentPlatforms;
			} else { // Is a departure
				numDeparture++;
				currentPlatforms--;
			}

		}
		if (numArrival < totArrivals) {
			maxPlatforms += totArrivals - 1 - numArrival;
		}

		return maxPlatforms;
	}

}
