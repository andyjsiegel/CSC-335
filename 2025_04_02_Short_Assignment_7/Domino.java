import java.util.Objects;
import java.util.Comparator;

public final class Domino {
    public final Value SIDE_1;
    public final Value SIDE_2;

    public Domino(Value side1, Value side2) {
        this.SIDE_1 = side1;
        this.SIDE_2 = side2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Domino)) return false;
        Domino domino = (Domino) o;
        return (SIDE_1 == domino.SIDE_1 && SIDE_2 == domino.SIDE_2) ||
               (SIDE_1 == domino.SIDE_2 && SIDE_2 == domino.SIDE_1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SIDE_1, SIDE_2);
    }

    @Override
    public String toString() {
        return "[" + SIDE_1 + "|" + SIDE_2 + "]";
    }

    public static Comparator<Domino> sumComparator() {
        return new Comparator<Domino>() {
            public int compare(Domino domino1, Domino domino2) {
                return domino1.getSum() - domino2.getSum();
            }
        };
    }

    public int getSum() {
        return SIDE_1.ordinal() + SIDE_2.ordinal();
    }
}
