package com.cognixia.jump.bridgeCourse.classes;

public class StringsDemo {

		public static void main(String[] args) {

				// String Pool - What happens in memory
				String s1 = "s1";
				String s2 = s1;
				String s3 = "s3";
				String s4 = new String("s1");

				System.out.println(s1.hashCode() + " " + s4.hashCode()); // Identical because of overrides
				System.out.println(s1 == s2); // true because memory locations are identical
				System.out.println(s1 == s4); // false because different memory locations
				System.out.println(s1.equals(s4)); // True, because the contents are the same

				// String - Object/instance methods
				String loopString = "we loop through this";

				for (int i = 0; i < loopString.length(); i++) {
						System.out.println(loopString.toCharArray()[i]);
				}

				loopString.charAt(0); // w
				loopString.charAt(4); // o
				loopString.charAt(50); // Out of Bounds Exception

				String substring = loopString.substring(4); // op through this
				String substring2 = loopString.substring(4, 9); // op thr

				// String - class/static methods

				int number = 5;
				String output = String.valueOf(number); // 5 (but in text form)
				System.out.println(output + output); // 55
				System.out.println(number + number); // 10

		}

}
