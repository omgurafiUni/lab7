package lab7;

import java.util.Calendar;

/**
 * Läs P7_3
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241015
 */
public class Pet {
	// Hämtar vilket år det är med hjälp av Calendar
	int presentYear = Calendar.getInstance().get(Calendar.YEAR);

	private String name = null;
	private int birthYear;

	// Första konstruktorn
	public Pet(String name) {
		// Anropa den andra konstruktorn med året vi är på
		this(name, Calendar.getInstance().get(Calendar.YEAR)); // Tar datan från andra konstruktorn med "this"
	}

	// Andra konstruktorn
	public Pet(String name, int birthYear) {
		// Ingen direkt tillgång till instansvariabler här, använder metoder
		setName(name); // Använd privat setName-metod
		setBirthYear(birthYear); // Använd privat setBirthYear-metod
	}

	// Privat metod för att sätta namn
	private void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Namnet får inte vara tomt");
		}
		this.name = name;
	}

	// Privat metod för att sätta födelseår
	private void setBirthYear(int birthYear) {
		String birthYearStr = Integer.toString(birthYear); // Konvertera int till String
		if (birthYearStr.length() != 4) {
			throw new IllegalArgumentException("Årtalet kan inte ha mindre eller mer än 4 siffror");
		}
		if (birthYear > presentYear) {
			throw new IllegalArgumentException("Födelseåret kan inte vara i framtiden");
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