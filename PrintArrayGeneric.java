package com.bridgelabz.generictask;

/**
 * Program to print an array using Generics
 * 
 * @author : Snehal Patil
 *
 */
public class PrintArrayGeneric {

	//Generic method to print an array
	private static <E> void toPrint(E[] inputArray) {

		for (E element : inputArray) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("---------------Generic demo --------------- ");
		System.out.println();

		// Array initialisation
		Integer[] intArray = { 2, 4, 6, 8, 10 };
		Double[] doubleArray = { 1.1, 3.3, 5.5, 7.7 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		// Print Array
		System.out.print("Integer Array : ");
		toPrint(intArray);
		System.out.println();

		System.out.print("Double Array : ");
		toPrint(doubleArray);
		System.out.println();

		System.out.print("Charater Array : ");
		toPrint(charArray);
	}
}
