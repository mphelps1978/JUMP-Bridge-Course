package com.cognixia.jump.bridgeCourse.project;

import java.util.Scanner;

public class FizzBuzz {

		public static void main(String[] args) {
				Scanner input;
				boolean valid = false;
				int userInt = 0;

				do {
						try {
								input = new Scanner(System.in);
								System.out.println("Please enter a number greater than 0: ");
								userInt = input.nextInt();
								if (userInt > 0) {
										fizzBuzz(userInt);
										valid = true;
								} else {
										System.out.println("Invalid Entry: ");
								}
						} catch (Exception e) {
								e.printStackTrace();
						}

				} while (!valid);

		}

		public static void fizzBuzz(int n) {
				String[] stringArray = new String[n];

				System.out.println("\n");

				for (int i = 0; i < n; i++) {
						if (isPrime(i)) {
								continue; // Will insert null into array[i]

						} else if (i % 3 == 0 && i % 5 == 0) {
								stringArray[i] = "FizzBuzz ";
						} else if (i % 3 == 0) {
								stringArray[i] = "Fizz ";
						} else if (i % 5 == 0) {
								stringArray[i] = "Buzz ";
						} else {
								stringArray[i] = String.valueOf(i); // Convert the int type to string to prevent type mismatch
						}
				}

				for (int i = 0; i < stringArray.length; i++) {
						if (stringArray[i] == null) {
								continue; // Need to filter out the nulls so they don't display
						}
						System.out.println(stringArray[i]);
				}
		}

		public static boolean isPrime(int n) {
				if (n <= 1)
						return false;

				for (int i = 2; i < n; i++) {
						if (n % i == 0) {
								return false;
						}
				}
				return true;
		}
}
