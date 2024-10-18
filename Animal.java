package lab7.animals;

import java.util.Calendar;

/**
 * Läs P7_5
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241015
 */
public class Animal {
	// Hämtar vilket år det är med hjälp av Calendar
	int presentYear = Calendar.getInstance().get(Calendar.YEAR);

	private String name = null;
	private int birthYear;

	// Första konstruktorn
	public Animal(String name) {
		// Hämtar vilket år det är med hjälp av Calendar
		this(name, Calendar.getInstance().get(Calendar.YEAR));
	}

	// Andra konstruktorn
	public Animal(String name, int birthYear) {
		// Ingen direkt tillgång till instansvariabler här, använder metoder
		setName(name); // Använd privat setName-metod
		setBirthYear(birthYear); // Använd privat setBirthYear-metod
	}

	// Privat metod för att sätta namn
	private void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	// Privat metod för att sätta födelseår
	private void setBirthYear(int birthYear) {
		if (birthYear > presentYear) {
			throw new IllegalArgumentException("Birth year cannot be in the future");
		}
		this.birthYear = birthYear;
	}

	// Hämtar namn
	public String getName() {
		return name;
	}

	// Hämtar ålder
	public int getAge() {
		return presentYear - birthYear;
	}
}