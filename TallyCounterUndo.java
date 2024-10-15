package lab7;

/**
 * Läs P7_1
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241014
 */
public class TallyCounterUndo extends TallyCounter {
	public TallyCounterUndo() {
		super(); // super() används för att anropa moderklassens konstruktor
	}

	// Minskar värdet med 1 så länge det inte blir negativt
	public void undo() {
		if (counter > 0) {
			this.counter--;
		}
	}
}