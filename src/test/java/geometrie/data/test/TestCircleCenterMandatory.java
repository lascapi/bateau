package geometrie.data.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometrie.data.Circle;
import geometrie.data.Point;

class TestCircleCenterMandatory {

	@Test
	void testConstructCircelWithNoCenter() {
		Point p = new Point(0d, 0d, "A");
		Circle circle = new Circle(p, 1d);
		assertSame(p, circle.getCenter());
	}
	
	@Test
	void testSetNoName() {
		Point p = new Point(0d, 0d, "A");
		p.setName(null);
		assertNull(p.getName());
	}

	@Test
	void testConstructCircelWithCenter() {
		assertDoesNotThrow(() -> {
			Point p = new Point(0d, 0d, "A");
			return new Circle(p, 1d);
		});
	}
	
	@Test
	void testSetName() {
		Point p = new Point(0d, 0d, null);
		p.setName("A");
		assertNotNull(p.getName());
	}

}
