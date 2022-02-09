package com.cognixia.jump.bridgeCourse.classes;

public class Dog extends Animal { // inheriting from the Animal Class in Animal.java
																	// Now Dog has all of the data in Animal accessible (Except private data)

		// Composition object
		Collar collar;

		public Dog() {
				super("Dog", 25); // Super keyword calls the constructor from the inherited class
				collar = new Collar(0, "address");
		}

		public Dog(String type, int weight, int id, String address) {
				setType(type);
				setWeight(weight);
				collar = new Collar(id, address);
		}

		// method overriding - Runtime polymorphism:
		@Override
		public void makeNoise(String sound) { // Overriding methods requires the same signature as the parent
				System.out.println("Woof, " + sound); // same method as parent, just overriding the output

		}

		// overloading a method - compile time polymorphism:
		// does not require the inheritance relationship - The method name remains the
		// same, however there has to be enough change in the signature for the compiler
		// to understand what is happening

		public String makeNoise(String sound, int numberOfTimes) { // Changing the return type and adding a parameter
				String sounds = sound;
				for (int i = 1; i < numberOfTimes; i++) {
						sounds += sound;
				}
				return sounds;
		}

		public Collar getCollar() {
				System.out.println(collar.getId() + " " + collar.getAddress());
				return collar;
		}

		public void setCollar(Collar collar) {
				this.collar = collar;
		}

		@Override
		public String toString() {
				return "Dog [collar=" + collar + ", getType()=" + getType() + ", getWeight()=" + getWeight() + "]";
		}

}
