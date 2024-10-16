package lab7;

/**
 * Skapar klassen Cat och Dog och testar dess metoder
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241015
 */
public class P7_4 {
	public static void main(String[] args) {
		// Skapa katter med ett namn¨'
		Cat katt1 = new Cat("Bob");
		Cat katt2 = new Cat("Findus", 2008);
		Cat katt3 = new Cat("Maura", 2012, true);

		Dog hund1 = new Dog("Lillis");
		Dog hund2 = new Dog("Dante", 2014);
		Dog hund3 = new Dog("Trio", 2007, true);

		System.out.println("Första katten: " + katt1.getDescription());
		System.out.println(katt1.makeSound());
		System.out.println("Andra katten: " + katt2.getDescription());
		System.out.println("Tredje katten: " + katt3.getDescription() + "\n");

		System.out.println("Första hunden: " + hund1.getDescription());
		System.out.println(hund1.makeSound());
		System.out.println("Andra hunden: " + hund2.getDescription());
		System.out.println("Tredje hunden: " + hund3.getDescription());

		System.out.println("\nÄr tredje katten en innekatt? " + katt3.isIndoor());
		System.out.println("Är tredje hunden en jakthund? " + hund3.isHunting());
	}
}