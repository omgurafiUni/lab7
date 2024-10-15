package lab7;

/**
 * Läs P7_4
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241014
 */
public class Cat extends Pet {
	private boolean indoor;

	// Konstruktor
	Cat(String name) {
		super(name);
		this.indoor = false;
	}

	// Andra konstruktor
	Cat(String name, int birthYear) {
		super(name, birthYear);
		this.indoor = false;
	}

	// Tredje konstruktor
	Cat(String name, int birthYear, boolean indoor) {
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
