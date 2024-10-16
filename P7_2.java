package lab7;

/**
 * Program som testar TallyCounter med en subklass AV en subklass
 * "TallyCounterLimit" <-- "TallyCounterLimit"
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241014
 */
public class P7_2 {
	public static void main(String[] args) {
		TallyCounterLimit tallyCounterLimit = new TallyCounterLimit(5);
		System.out.println("Startvärde med limit 5: \n" + tallyCounterLimit.getValue()); // Borde vara 0

		// Count tills vi når gränsen "limit"
		try {
			tallyCounterLimit.count();
			tallyCounterLimit.count();
			tallyCounterLimit.count();
			tallyCounterLimit.count();
			tallyCounterLimit.count();
			System.out.println("Värdet efter 5 counts: \n" + tallyCounterLimit.getValue()); // Borde vara 5

			// Försök att gå förbi limit, då ska exceptionen throwas
			tallyCounterLimit.count(); // Här ska exceptionen kastas
		} catch (IllegalStateException e) {
			System.out.println("Exception: " + e.getMessage()); // Ska printa limit exception
		}

		// Testa att sätta en ny limit
		System.out.println("\nSätter den nya limiten till 3 och reset-ar countern:\n");
		tallyCounterLimit.reset();
		tallyCounterLimit.setLimit(3);

		// Försök räkna upp till den nya limiten
		try {
			tallyCounterLimit.count();
			tallyCounterLimit.count();
			tallyCounterLimit.count();
			System.out.println("Värdet efter 3 counts (limit är 3): \n" + tallyCounterLimit.getValue()); // Should be 3

			// Försök att gå förbi den nya limiten
			tallyCounterLimit.count(); // Här ska exceptionen kastas
		} catch (IllegalStateException e) {
			System.out.println("Exception: " + e.getMessage()); // Ska printa limit exception
		}

		// Testa att undo funkar i TallyCounterLimit
		tallyCounterLimit.undo();
		System.out.println("Värdet efter en undo: \n" + tallyCounterLimit.getValue()); // Borde vara 2

		// Försök att köra undo under 0
		tallyCounterLimit.undo();
		tallyCounterLimit.undo();
		tallyCounterLimit.undo(); // Borde stanna på 0
		System.out.println("Värdet efter flera undo-försök (försök förbi gränsen): \n" + tallyCounterLimit.getValue()); // Borde
																														// vara
																														// 0
	}
}