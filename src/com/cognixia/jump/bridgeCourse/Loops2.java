package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class Loops2 {
  public static void main(String[] args) {
    boolean valid = false;
    Scanner input;
    int userInt = 0;

    do {
      try {
        input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        userInt = input.nextInt();
        valid = true;

      } catch (Exception e) {
        System.out.println("Please enter only an integer");
      }

    } while (!valid);
    System.out.println("Your valid input was: " + userInt);

    // for loop based on user input

    System.out.println("\nFor loop demo");
    for (int i = 0; i < 6; i++) {
      for (int j = 3; j > 0; j--) {
        System.out.println("i=" + i + " " + "j=" + j);

      }
    }

    // Conditional Logic

    while (userInt > 0 && userInt < 50) {
      System.out.println("You're in the range");
    }
  }
}
