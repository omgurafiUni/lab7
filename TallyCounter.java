package lab7;

public class TallyCounter {
	protected int counter = 0;

	public TallyCounter() {

	}

	public void count() {
		if (this.counter < Integer.MAX_VALUE)
			this.counter++;
	}

	public int getValue() {
		return this.counter;
	}

	public void reset() {
		this.counter = 0;
	}
}