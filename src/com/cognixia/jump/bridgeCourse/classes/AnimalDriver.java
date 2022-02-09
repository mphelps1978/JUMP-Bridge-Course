package com.cognixia.jump.bridgeCourse.classes;

public class AnimalDriver {
		public static void main(String[] args) {
				Animal ourAnimal = new Animal("Dog", 30);
				Dog ourDog = new Dog();
				Dog dog2 = new Dog("Lab", 10, 10, "USA");

				ourAnimal.jump(); // Because the jump method is a default method in the Creature interface, we can
													// use it without any additional implementation, and it is tied to the ourAnimal
													// class

				Creature.run(); // Because run is a static method in the Creature interface, we can call it by
												// referencing the parent (Creature) interface

				System.out.println(dog2);
		}
}
