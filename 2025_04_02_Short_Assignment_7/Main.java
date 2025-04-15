public class Main {
	public static void main(String[] args) {		
		DrawableSet full = new DrawableSet();
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		CardStack stack1 = new CardStack();
		CardStack stack2 = new CardStack();
		deck1.shuffle();
		for(Card c : deck1) {
			stack1.addCard(new Card(c.RANK,c.SUIT));
		}
		deck2.shuffle();
		for(int i = 0; i < 10; i++)
			stack2.addCard(deck2.draw());
		DrawableSet ds = new DrawableSet();
		deck1.shuffle();
		ds.addSet(deck1);
		ds.addSet(stack1);
		full.addSet(deck2);
		full.addSet(ds);
		full.addSet(stack2);
		
		int count = 0;
		while(!full.isEmpty()) {
			Card c = full.draw();
			count++;
		}
		System.out.println("Total = " + count);//Total should be 156
		System.out.println();
		
		deck1.sortByRankFirst();
		System.out.println("Sorted by Rank First: ");
		for(Card c : deck1) {
			System.out.println(c);
		}
		
		deck1.sortBySuitFirst();
		System.out.println("Sorted by Suit First: ");
		for(Card c : deck1) {
			System.out.println(c);
		}
		
		DominoSet dominos = new DominoSet();
		dominos.sort();
		for(Domino d : dominos)
			System.out.println(d);
	}
}
