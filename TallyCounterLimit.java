package lab7;

/**
 * Läs P7_2
 * 
 * @author 24adsa02 (Adam Sandén)
 * @version 20241014
 */
public class TallyCounterLimit extends TallyCounterUndo {
	private int limit;

	// Första konstruktorn som sätter limit till den högsta möjliga integern
	public TallyCounterLimit() {
		super(); // super() används för att anropa moderklassens konstruktor
		this.limit = Integer.MAX_VALUE;
	}

	// Andra konstruktorn som hindrar värdet från att bli negativt med throw
	public TallyCounterLimit(int limit) {
		super();
		if (limit < 0) {
			throw new IllegalArgumentException("limit får inte vara negativ");
		}
		this.limit = limit;
	}

	// Ökar värdet med 1 så länge det inte går över limit med throw
	public void count() {
		if (counter >= limit) {
			throw new IllegalStateException("counter går över gränsen (limit)");
		}
		if (this.counter < Integer.MAX_VALUE) {
			this.counter++;
		}
	}

	// Sätter en gräns så länge gränsen inte är negativ, annars kastas (throwas)
	// värdet
	public void setLimit(int limit) {
		if (limit < 0) {
			throw new IllegalArgumentException("limit får inte vara negativ");
		}
		this.limit = limit;
	}
}