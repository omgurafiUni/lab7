package lab7;

public class TallyCounterLimit extends TallyCounterUndo {
	private int limit;

	public TallyCounterLimit() {
		super();
		this.limit = Integer.MAX_VALUE;
	}

	public TallyCounterLimit(int limit) {
		super();
		if (limit < 0) {
			throw new IllegalArgumentException("limit får inte vara negativ");
		}
		this.limit = limit;
	}

	public void count() {
		if (counter >= limit) {
			throw new IllegalStateException("counter går över gränsen (limit)");
		}
		if (this.counter < Integer.MAX_VALUE) {
			this.counter++;
		}
	}

	public void setLimit(int limit) {
		if (limit < 0) {
			throw new IllegalArgumentException("limit får inte vara negativ");
		}
		this.limit = limit;
	}
}
