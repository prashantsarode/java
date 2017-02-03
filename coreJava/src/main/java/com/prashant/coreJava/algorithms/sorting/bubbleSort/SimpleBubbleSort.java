package com.prashant.coreJava.algorithms.sorting.bubbleSort;

import java.util.Arrays;

public class SimpleBubbleSort {

	public static void bubbleSort(int[] numbers) {

		System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > i; j--) {
				if (numbers[j] < numbers[j - 1]) {
					swap(numbers, j, j - 1);
				}
			}
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
