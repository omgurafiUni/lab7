package lab7;

/**
 * Program som testar TallyCounter med en subklass "TallyCounterUndo"
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241014
 */
public class P7_1 {
	public static void main(String[] args) {
		TallyCounterUndo tallyCounterUndo = new TallyCounterUndo();
		System.out.println("Startvärdet: " + tallyCounterUndo.getValue()); // Output: 0

		// Count flera gånger
		tallyCounterUndo.count();
		tallyCounterUndo.count();
		tallyCounterUndo.count();
		System.out.println("Värdet efter 3 count: " + tallyCounterUndo.getValue()); // Output: 3

		// Undo-a en count
		tallyCounterUndo.undo();
		System.out.println("Värdet efter en undo: " + tallyCounterUndo.getValue()); // Output: 2

		// Undo ända tills värdet når 0
		tallyCounterUndo.undo();
		tallyCounterUndo.undo();
		tallyCounterUndo.undo(); // Ska inte gå under 0
		System.out.println("Värdet efter 3 mer undo-försök: " + tallyCounterUndo.getValue()); // Output: 0

		// Testa count och undo efter reset
		tallyCounterUndo.reset();
		tallyCounterUndo.count();
		tallyCounterUndo.undo();
		System.out.println("Value after 1 count and 1 undo: " + tallyCounterUndo.getValue()); // Should be 0
	}
}
