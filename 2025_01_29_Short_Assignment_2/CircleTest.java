import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    void testArea() {
        Circle c1 = new Circle(0,0,4);
        assertEquals(c1.area(),4*4*Math.PI);
    }

    @Test
    void testCircumference() {
        Circle c2 = new Circle(0,0,5);
        assertEquals(c2.circumference(),2*5*Math.PI);
    }
    
    @Test
    void testResize() {
        Circle c3 = new Circle(0,0,3);
        c3.resize(5);
        assertEquals(c3.area(), 15*15*Math.PI);
        assertEquals(c3.circumference(), 2*15*Math.PI);
    }

    @Test
    void testEquals() {
        Circle c4 = new Circle(0,0,2);
        // test null branch
        assertFalse(c4.equals(null));
        // test == this branch
        assertTrue(c4.equals(c4));
        // test different class branch
        assertFalse(c4.equals(new Rectangle(0,0,2,2)));
        // test radii are equal branch
        Circle c5 = new Circle(0,0,2);
        assertTrue(c4.equals(c5));
        // test radii are not equal branch
        Circle c6 = new Circle(0,0,3);
        assertFalse(c4.equals(c6));
    }

}
