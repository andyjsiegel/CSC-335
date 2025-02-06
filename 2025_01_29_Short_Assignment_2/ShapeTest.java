import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    
    @Test
    void testGetPosition() {
        Shape s1 = new Shape(0,0);
        assertEquals(s1.getPosition().X, 0);
        assertEquals(s1.getPosition().Y, 0);
    }

    @Test
    void testTranslate() {
        Shape s2 = new Shape(0,0);
        s2.translate(2,3);
        assertEquals(s2.getPosition().X, 2);
        assertEquals(s2.getPosition().Y, 3);
    }

    @Test
    void testRectangleTranslate() {
        Rectangle r3 = new Rectangle(0,0,4,7);
        r3.translate(2,3);
        XYPoint[] corners = r3.getCorners();
		assertEquals(corners[0].X, 2);
		assertEquals(corners[0].Y, 3);
		assertEquals(corners[1].X, 6);
		assertEquals(corners[1].Y, 3);
		assertEquals(corners[2].X, 2);
		assertEquals(corners[2].Y, -4);
		assertEquals(corners[3].X, 6);
		assertEquals(corners[3].Y, -4);
    }
}
