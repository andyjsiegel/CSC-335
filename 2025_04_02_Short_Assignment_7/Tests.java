import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {
	private Card aceOfSpades = new Card(Rank.ACE,Suit.SPADES);
	private Card queenOfHearts = new Card(Rank.QUEEN,Suit.HEARTS);
	private Card kingOfClubs = new Card(Rank.KING,Suit.CLUBS);
	
	private CardStack stack = new CardStack();
	private Deck deck = new Deck();
	private DominoSet dSet = new DominoSet();
	
	@Test
	void testCardStack() {
		stack.addCard(aceOfSpades);
		stack.addCard(queenOfHearts);
		stack.addCard(kingOfClubs);
		Card c = stack.draw();
		assertEquals(c,kingOfClubs);
	}
	
	@Test
	void testCardStackIsEmpty() {
		assertTrue(stack.isEmpty());
		stack.addCard(aceOfSpades);
		assertFalse(stack.isEmpty());
	}
	
	@Test
	void testDeckDraw() {
		Card c = deck.draw();
		assertEquals(c,new Card(Rank.ACE,Suit.HEARTS));
	}
	
	@Test
	void testDeckIsEmpty() {
		assertFalse(deck.isEmpty());
		for(int i = 0; i < 52; i++)
			deck.draw();
		assertTrue(deck.isEmpty());
	}
	
	@Test
	void testDominosDraw() {
		Domino d = dSet.draw();
		assertEquals(d, new Domino(Value.ZERO, Value.ZERO));
	}
	
	@Test
	void testDominosIsEmpty() {
		assertFalse(dSet.isEmpty());
		for(int i = 0; i < 28; i++)
			dSet.draw();
		assertTrue(dSet.isEmpty());
	}

}
