package lab7;

/**
 * Läs P7_1 eller P7_2
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241014
 */
public class TallyCounter {
	protected int counter = 0; // protected kan bara anropas från samma package och subklasser

	// Tom konstruktor
	public TallyCounter() {

	}

	// Ökar värdet med ett för varje count
	public void count() {
		if (this.counter < Integer.MAX_VALUE)
			this.counter++;
	}

	// Hämtar värdet
	public int getValue() {
		return this.counter;
	}

	// Återställer värdet till 0
	public void reset() {
		this.counter = 0;
	}
}