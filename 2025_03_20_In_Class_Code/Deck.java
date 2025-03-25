import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
		this.deck = new ArrayList<Card>();
		initialize();
		Collections.shuffle(deck);
	}
	
	private void initialize() {
		for(Suit suit : Suit.values())
			for(Rank rank : Rank.values())
				deck.add(new Card(rank,suit));
	}
}
