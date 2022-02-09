package com.cognixia.jump.bridgeCourse.classes;

public class Animal implements Creature, Basic {

		// Attributes
		private String type;
		private int weight;

		private static int count; // This will bind to the class Animal, but will not be applied to the
		// constructor

		// code block - executes when you create an object that loads the class, and
		// before the constructor. Independent of the constructor (Local Scoped)
		{
				System.out.println("This is the regular code block.");
		}

		// static code block - cannot access attributes- it's bound to the class.
		static {
				count = 0;
				System.out.println("This is the static code block. We have " + count + " animal objects");
		}

		// Constructor - Only applies to objects
		// Default:
		public Animal() {
				this.type = null;
				this.weight = 0;
				System.out.println("This is our constructor for a " + this.type + " of weight " + this.weight + "lbs.");
				count++; // Once we create a new Animal, the count will increase
		}

		// Overloaded:
		public Animal(String type, int weight) {
				// this keyword distinguishes the instance (object) as the reference
				this.type = type;
				this.weight = weight;
				System.out.println("This is our constructor for a " + this.type + " of weight " + this.weight + "lbs.");
				count++;
		}

		// Methods
		@Override
		public void makeNoise(String sound) { // since makeNoise is declared as an instance method, we override it to
																					// include the implementation. makeNoise is declared as an instance method
																					// within Creature AND Basic. But because there is no implementation, there
																					// will be no conflict.
				System.out.println("The " + type + " makes a " + sound + " sound.");
		}

		// getters and setters protect the data within the class
		public String getType() {
				return type;
		}

		public void setType(String type) {
				this.type = type;
		}

		public int getWeight() {
				return weight;
		}

		public void setWeight(int weight) {
				this.weight = weight;
		}

		// Static Features
		public static String animals() {
				return "All " + count + " animals are making noise";
		}

		// Interface method signatures MUST be implimented. These come from the Creature
		// interface
		@Override
		public int move(int x) {
				// TODO Auto-generated method stub
				return 0;
		}

		@Override
		public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Animal Eating");

		}
}
