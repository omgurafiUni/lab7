package lab7;

/**
 * Skapar klassen Pet och testar dess metoder
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241015
 */
public class P7_3 {
	public static void main(String[] args) {
		// Skapa ett djur med ett namn
		Pet pet1 = new Pet("Maura");
		System.out.println("Pet 1 Name: " + pet1.getName());
		System.out.println("Pet 1 Age: " + pet1.getAge());

		// Skapa ett djur med ett namn och födelseår
		Pet pet2 = new Pet("Mr Munchkins Mans", 2020);
		System.out.println("Pet 2 Name: " + pet2.getName());
		System.out.println("Pet 2 Age: " + pet2.getAge());

		// Testa att skapa ett djur utan namn
		try {
			Pet pet3 = new Pet("");
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getLocalizedMessage()); // Utskrift: "Namnet får inte vara tomt"
		}

		try {
			Pet pet4 = new Pet("Max", 2030);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getLocalizedMessage()); // Utskrift: "Födelseåret kan inte vara i
																			// framtiden"
		}

		try {
			Pet pet5 = new Pet("Bob", 789);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getMessage()); // Utskrift: "Årtalet kan inte ha mindre eller mer än 4
																// siffror"
		}
	}
}