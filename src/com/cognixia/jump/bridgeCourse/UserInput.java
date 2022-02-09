package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
	// create scanner object
	Scanner input = new Scanner(System.in);

	// prompt for user input
	String prompt = "Please Enter a Sentence: ";
	System.out.println(prompt);

	// read from console
	String storage = input.nextLine();

	// output user input
	System.out.println("You typed: " + "\"" + storage + "\"");

	// close scanner
	input.close();

    }

}
