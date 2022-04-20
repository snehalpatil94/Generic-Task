package com.bridgelabz.generictask;

/**
 * Write a program to print Integer, Double and Character
 * 
 * @author : Snehal Patil
 *
 */
public class PrintArray {

	// Printing Integer Array
	private static void toPrint(Integer[] inputArray) {
		System.out.print("Integer Array : ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();
	}

	// Printing Double Array
	private static void toPrint(Double[] inputArray) {
		System.out.print("Double Array : ");
		for (double element : inputArray) {
			System.out.printf(element + "  ");
		}
		System.out.println();
	}

	// Printing Character Array
	private static void toPrint(Character[] inputArray) {
		System.out.print("Charater Array : ");
		for (char element : inputArray) {
			System.out.printf("%s ", element);
		}
	}

	public static void main(String[] args) {
		System.out.println("------------------- Generic demo -------------------- ");
		System.out.println();
		
		// Array initialisation
		Integer[] intArray = { 2, 4, 6, 8, 10 };
		Double[] doubleArray = { 1.1, 3.3, 5.5, 7.7 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		// Print Array
		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);
	}
}