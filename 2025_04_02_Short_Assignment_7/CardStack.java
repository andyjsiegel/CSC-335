import java.util.ArrayList;
import java.util.Iterator;

public class CardStack implements Drawable<Card>, Iterable<Card> {
	private ArrayList<Card> stack;
	
	public CardStack() {
		this.stack = new ArrayList<Card>();
	}

	public Card draw() {
		return stack.remove(0);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public Drawable<Card> copy() {
		CardStack copy = new CardStack();
		for(Card c : stack)
			copy.addCard(c);
		return copy;
	}
	
	//adds a Card to the top of the stack, which
	//is index 0
	public void addCard(Card card) {
		stack.add(0, card);
	}

	@Override
	public Iterator<Card> iterator() {
		return stack.iterator();
	}
}
