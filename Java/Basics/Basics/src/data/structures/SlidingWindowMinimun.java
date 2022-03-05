package data.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMinimun {

	public static void main(String[] args) {
		int[] array = { 2, 6, -1, 2, 4, 1, -6, 5 };

		System.out.println(Arrays.toString(slidingWindowMinimun(array, 3)));

	}

	public static int[] slidingWindowMinimun(int[] array, int k) {
		List<Integer> minimums = new ArrayList<>();
		LinkedList<Integer> queue = new LinkedList<>(); // queue to store the sliding window

		for (int i = 0; i < array.length; i++) {
			// Removes greater number from the tail
			while (!queue.isEmpty() && array[i] < array[queue.getLast()])
				queue.removeLast();
			// Removes the number out of the slide windows
			if (!queue.isEmpty() && queue.getFirst() == i - k)
				queue.removeFirst();
			// Add the current number to the queue
			queue.add(i);
			// Builds the minimums if the slide window is already full
			if (i >= k - 1)
				minimums.add(array[queue.getFirst()]);
		}

		return minimums.stream().mapToInt(n -> n).toArray();
	}

}
