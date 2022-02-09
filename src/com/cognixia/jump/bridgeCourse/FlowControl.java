package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class FlowControl {

		public static void main(String[] args) {
				try {
						Scanner input = new Scanner(System.in);
						System.out.println("Please enter an input: ");
						int testCase = input.nextInt();

						switch (testCase) {
								case 1:
										System.out.println("Hello");
										break;
								case 2:
										System.out.println("Goodbye!");
										break;
								default:
										System.out.println("Never mind.");
						}

						System.out.println("Your input was: " + testCase);
						input.close();
				} catch (Exception e) {
						e.printStackTrace();
				}

		}

}

//if (testCase.equalsIgnoreCase("Hello")) {
//System.out.println("Hello to you too!");
//}
//
//else if (testCase.equalsIgnoreCase("Goodbye")) {
//System.out.println("Have a great day!");
//}
//
//else {
//System.out.println("Well fine then. Don't talk to me!");
//}