import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	
	@Test
	void testPerimeter() {
		Rectangle r1 = new Rectangle(0,0,4,7);
		assertEquals(r1.perimeter(),22.0);
	}

	@Test
	void testArea() {
		Rectangle r2 = new Rectangle(0,0,4,7);
		assertEquals(r2.area(),28.0);
	}

	@Test
	void testResize() {
		Rectangle r3 = new Rectangle(0,0,4,7);
		r3.resize(5);
		assertEquals(r3.area(),700.0);
		assertEquals(r3.perimeter(),110.0);
	}

	@Test
	void testGetCorners() {
		Rectangle r4 = new Rectangle(0,0,4,7);
		XYPoint[] corners = r4.getCorners();
		assertEquals(corners[0].X, 0);
		assertEquals(corners[0].Y, 0);
		assertEquals(corners[1].X, 4);
		assertEquals(corners[1].Y, 0);
		assertEquals(corners[2].X, 0);
		assertEquals(corners[2].Y, -7);
		assertEquals(corners[3].X, 4);
		assertEquals(corners[3].Y, -7);
	}
	
	@Test
    void testEquals() {
        Rectangle r4 = new Rectangle(0,0,3,4);
        // test null branch
		assertFalse(r4.equals(null));
        // test == this branch
		assertTrue(r4.equals(r4));
        // test different class branch
		assertFalse(r4.equals(new Object()));
        // test length and height are equal branch
        Rectangle r5 = new Rectangle(0,0,3,4);
		assertTrue(r4.equals(r5));
        // test length and height are not equal branch
        Rectangle r6 = new Rectangle(0,0,3,5);
		assertFalse(r4.equals(r6));
    }
}
