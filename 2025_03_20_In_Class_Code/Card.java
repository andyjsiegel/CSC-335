
public class Card implements Comparable<Card> {
	public final Rank RANK;
	public final Suit SUIT;
	
	public Card(Rank rank, Suit suit) {
		this.RANK = rank;
		this.SUIT = suit;
	}

	public int compareTo(Card other) {
		if(this.RANK.getValue() > other.RANK.getValue())
			return 1;
		else if(this.RANK.getValue() < other.RANK.getValue())
			return -1;
		else if(this.SUIT.getValue() > other.SUIT.getValue())
			return 1;
		else if(this.SUIT.getValue() < other.SUIT.getValue())
			return -1;
		else
			return 0;
	}

	public String toString() {
		return RANK.toString() + " of " + SUIT.toString();
	}
}
