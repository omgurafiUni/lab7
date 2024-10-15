package lab7;

/**
 * Läs P7_4
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241014
 */
public class Dog extends Pet {
	private boolean hunting;

	// Konstruktor
	Dog(String name) {
		super(name);
		this.hunting = false;
	}

	// Andra konstruktor
	Dog(String name, int birthYear) {
		super(name, birthYear);
		this.hunting = false;
	}

	// Tredje konstruktor
	Dog(String name, int birthYear, boolean hunting) {
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
