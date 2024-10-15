package lab7.animals.pet;

import lab7.animals.Animal;

/**
 * Läs P7_4
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241015
 */
public class Dog extends Animal {
	private boolean hunting;

	// Konstruktor
	public Dog(String name) {
		super(name);
		this.hunting = false;
	}

	// Andra konstruktor
	public Dog(String name, int birthYear) {
		super(name, birthYear);
		this.hunting = false;
	}

	// Tredje konstruktor
	public Dog(String name, int birthYear, boolean hunting) {
		super(name, birthYear);
		this.hunting = hunting;
	}

	public String makeSound() {
		return "Vov vov!";
	}

	public String getDescription() {
		return "Hund, " + getName() + ", " + getAge() + " år, " + hunting;
	}

	public boolean isHunting() {
		return hunting;
	}
}
