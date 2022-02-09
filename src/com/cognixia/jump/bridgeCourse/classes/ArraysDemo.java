package com.cognixia.jump.bridgeCourse.classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {

		public static void main(String[] args) {

				// Declare Array
				// Primitive:
				int[] intArray;
				int[] intArray2 = { 1, 2, 3, 4, 5 };

				// Object:
				Dog[] dogArray;
				Dog[] dogArray2 = { new Dog(), new Dog(), new Dog() };
				System.out.println(dogArray2.length);

				// Initialize Array
				intArray = new int[5];
				dogArray = new Dog[5];
				System.out.println(intArray.length);

				// Access Array
				intArray[4] = 4;
				System.out.println(intArray[4]);
				System.out.println(intArray2[3]);

				dogArray[0] = new Dog("lab", 70, 5, "home");
				Dog dogRef = new Dog("Poodle", 10, 5, "USA");
				dogArray[1] = dogRef;
				System.out.println(dogArray[0]);
				System.out.println(dogArray[1]);

				// dogArray[0] = null; // deletes an element

				// Iterate Array
				for (int i = intArray2.length - 1; i >= 0; i--) { // beter control over how we loop
						System.out.println(intArray2[i]);
				}

				for (int i = 0; i < dogArray.length; i++) {
						System.out.println(dogArray[i]);
				}

				// for each loop
				for (int i : intArray2) {
						System.out.println(i);
				}

				for (Dog dog : dogArray) {
						System.out.println(dog);
				}

				// Use Array and Arrays classes
				int length1 = Array.getLength(dogArray);
				int length2 = dogArray.length;
				System.out.println(length1 + " " + length2); // identical

				System.out.println(Arrays.toString(intArray2));

		}

}
