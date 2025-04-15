import java.util.ArrayList;

public class DrawableSet implements Drawable<Card>{
	private ArrayList<Drawable<Card>> cardSets;
	
	public DrawableSet() {
		cardSets = new ArrayList<Drawable<Card>>();
	}
	
	public void addSet(Drawable<Card> set) {
		cardSets.add(set.copy());
	}

	@Override
	public Card draw() {
		for (Drawable<Card> set : cardSets) {
			if (!set.isEmpty()) {
				return set.draw();
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		for (Drawable<Card> set : cardSets) {
			if (!set.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Drawable<Card> copy() {
		DrawableSet copy = new DrawableSet();
		for(Drawable<Card> set : cardSets)
			copy.addSet(set.copy());
		return copy;
	}
}
