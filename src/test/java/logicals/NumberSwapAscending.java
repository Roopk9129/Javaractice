package logicals;

import java.util.Arrays;

public class NumberSwapAscending {

	public static void main(String[] args) {
		int[] numbers = { 77, 66, 9, 3, 8, 1, 66, 99 }; // Replace this array with your desired input
		System.out.println("Original Array: " + Arrays.toString(numbers));

		// Bubble Sort for ascending order
		boolean swapped;

		for (int i = 0; i < numbers.length - 1; i++) {
			swapped = false;

			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					// Swap the elements
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					swapped = true;
				}
			}

			// If no two elements were swapped in the inner loop, the array is already
			// sorted.
			if (!swapped) {
				break;
			}
		}

		System.out.println("Sorted Array (Ascending Order): " + Arrays.toString(numbers));
	}
}
