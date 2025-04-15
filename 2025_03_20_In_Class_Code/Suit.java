public enum Suit {
	// HEARTS, DIAMONDS, SPADES, CLUBS;
	HEARTS(1), DIAMONDS(2), SPADES(3), CLUBS(4);

	
	private final int value;
	
	Suit(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
