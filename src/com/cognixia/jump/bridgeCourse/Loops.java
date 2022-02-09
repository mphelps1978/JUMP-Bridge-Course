package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// Prompt
		Scanner input;
		boolean valid;

		// Stored input, initialized to -1
		int testing = -1;

		// check for valid input, and grab the data

		do {
			input = new Scanner(System.in);
			System.out.println("Enter an Integer");
			valid = input.hasNextInt();

			if (valid) {
				testing = input.nextInt();
			}
		} while (!valid);

		System.out.println("You entered a valid input of: " + testing);
		input.close();

	}

}
