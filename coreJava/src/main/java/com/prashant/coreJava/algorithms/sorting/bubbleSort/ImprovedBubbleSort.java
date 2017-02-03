package com.prashant.coreJava.algorithms.sorting.bubbleSort;

import java.util.Arrays;

public class ImprovedBubbleSort {

	public static void bubbleSort(int[] numbers) {

		boolean swapped = true;
		int last = numbers.length - 2;

		System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));

		while (swapped) {
			swapped = false;
			for (int i = 0; i < last; i++) {
				if (numbers[i] > numbers[i + 1]) {
					swap(numbers, i, i + 1);
					swapped = true;
				}
			}
			last--;
		}

		System.out.printf("Sorted Array using Bubble sort algorithm :%s %n", Arrays.toString(numbers));

	}

	private static void swap(int[] numbers, int j, int i) {
		int temp = numbers[j];
		numbers[j] = numbers[i];
		numbers[i] = temp;
	}

	public static void main(String[] args) {
		bubbleSort(new int[] { 15, 87, 5, 98, 20, 15 });
		bubbleSort(new int[] { 1, 2, 3, 4, 5, 6 });
		bubbleSort(new int[] { 5, 4, 3, 2, 1, 0 });
	}

}
