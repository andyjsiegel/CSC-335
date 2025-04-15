import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DominoSet implements Iterable<Domino>, Drawable<Domino> {
    private ArrayList<Domino> set;

    public DominoSet() {
        this.set = new ArrayList<Domino>();
        addAll();
    }

    public void shuffle() {
        Collections.shuffle(set);
    }

    public void sort() {
        Collections.sort(set, Domino.sumComparator());
    }

    private void addAll() {
        for (int i = 0; i < Value.values().length; i++) {
            for (int j = i; j < Value.values().length; j++) {
                Domino d = new Domino(Value.values()[i], Value.values()[j]);
                set.add(d);
            }
        }
    }

    @Override
    public Domino draw() {
        return set.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public Drawable<Domino> copy() {
        DominoSet copy = new DominoSet();
        copy.set = new ArrayList<>(this.set); // Create a copy of the current set
        return copy;
    }

    @Override
    public Iterator<Domino> iterator() {
        return set.iterator();
    }
}
