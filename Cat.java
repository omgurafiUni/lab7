package lab7.animals.pet;

import lab7.animals.Animal;

/**
 * Läs P7_4
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241015
 */
public class Cat extends Animal {
	private boolean indoor;

	// Konstruktor
	public Cat(String name) {
		super(name);
		this.indoor = false;
	}

	// Andra konstruktor
	public Cat(String name, int birthYear) {
		super(name, birthYear);
		this.indoor = false;
	}

	// Tredje konstruktor
	public Cat(String name, int birthYear, boolean indoor) {
		super(name, birthYear);
		this.indoor = indoor;
	}

	public String makeSound() {
		return "Mjau, mjau";
	}

	public String getDescription() {
		return "Katt, " + getName() + ", " + getAge() + " år, " + indoor;
	}

	public boolean isIndoor() {
		return indoor;
	}
}