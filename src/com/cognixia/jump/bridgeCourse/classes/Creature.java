package com.cognixia.jump.bridgeCourse.classes;

public interface Creature extends Basic { // Must have access, and can extend another interface

		// Any atributes are public static final, so must be initialized, and not
		// necessary to declare
		int NUMBER = 0;

		// No access modifiers, and no implementation in methods, throwing out the idea,
		// but some other class implements it
		// Methods are inheritly abstract.
		// These are simply the signatures. The method is part of the interface, but
		// utilized in other classes
		int move(int x);

		void eat();

		void makeNoise(String sound);

		// After Java8

		default void jump() { // Default keyword allows interfaces to implement methods (instance method) Good
													// for common methods in an interface
				System.out.println("Jumping");
		}

		static void run() { // Static keyword likewise allows interfaces to implement methods
				System.out.println("Running");
		}

}
