
public enum Rank {
	// ACE, TWO, THREE, FOUR, FIVE, 
	// SIX, SEVEN, EIGHT, NINE, TEN,
	// JACK, QUEEN, KING;

	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), 
	SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
	JACK(11), QUEEN(12), KING(13);

	public int getValue() {
		return value;
	}

	private final int value;
	Rank(int value) {
		this.value = value;
	}
}
