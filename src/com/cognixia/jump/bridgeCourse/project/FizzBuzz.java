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

		public static void fizzBuzz(int n) {
				System.out.println("\n\n");
				for (int i = 0; i < n; i++) {
						if (isPrime(i)) {
								continue;
						}
						if (i % 3 == 0 && i % 5 == 0) {
								System.out.println("FizzBuzz ");
						} else if (i % 3 == 0) {
								System.out.println("Fizz ");
						} else if (i % 5 == 0) {
								System.out.println("Buzz ");
						} else {
								System.out.println(i);
						}

				}
		}

}
