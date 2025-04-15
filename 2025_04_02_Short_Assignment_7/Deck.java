import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck implements Iterable<Card>, Drawable<Card> {
	private ArrayList<Card> deck;
	
	public Deck() {
		this.deck = new ArrayList<Card>();
		initialize();
	}
	
	private void initialize() {
		for(Suit suit : Suit.values())
			for(Rank rank : Rank.values())
				deck.add(new Card(rank,suit));
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}

	public void sortByRankFirst() {
    	Collections.sort(deck, Card.rankFirstComparator());
	}

	public void sortBySuitFirst() {
		Collections.sort(deck, Card.suitFirstComparator());
	}

	public Card draw() {
		return deck.remove(0);
	}

	public boolean isEmpty() {
		return deck.isEmpty();
	}

	public Deck copy() {
        Deck copy = new Deck();
        copy.deck = new ArrayList<>(this.deck);
        return copy;
    }

	@Override
	public Iterator<Card> iterator() {
		return this.deck.iterator();
	}
}
