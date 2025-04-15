import java.util.Objects;
import java.util.Comparator;

public final class Card {
	public final Rank RANK;
	public final Suit SUIT;
	
	public Card(Rank rank, Suit suit) {
		this.RANK = rank;
		this.SUIT = suit;
	}
	
	@Override
	public String toString() {
		return RANK.toString() + " of " + SUIT.toString();
	}

	public static Comparator<Card> rankFirstComparator() {
		return new Comparator<Card>() {
			public int compare(Card card1, Card card2) {
				int comp = card1.RANK.ordinal() - card2.RANK.ordinal();
				if (comp == 0) {
					comp = card1.SUIT.ordinal() - card2.SUIT.ordinal();
				}
				return comp;
			}
		};
	}

	public static Comparator<Card> suitFirstComparator() {
		return new Comparator<Card>() {
			public int compare(Card card1, Card card2) {
				int comp = card1.SUIT.ordinal() - card2.SUIT.ordinal();
				if (comp == 0) {
					comp = card1.RANK.ordinal() - card2.RANK.ordinal();
				}
				return comp;
			}
		};
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Card)) return false;
		Card card = (Card) o;
		return RANK == card.RANK &&
				SUIT == card.SUIT;
	}

	@Override
	public int hashCode() {
		return Objects.hash(RANK, SUIT);
	}
}
