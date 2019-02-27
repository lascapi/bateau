package geometrie.data.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import geometrie.data.Point;


class TestPointNameOptional {

	@Test
	void testConstructorPointWithNoName() {
		Point p = new Point(0d, 0d, null);
		assertNull(p.getName());
	}
	
	@Test
	void testSetName() {
		Point p = new Point(0d, 0d, "A");
		p.setName(null);
		assertNull(p.getName());
	}
	
	@Test
	void testConstructorPointWithName() {
		Point p = new Point(0d, 0d, "A");
		assertNotNull(p.getName());
	}
	
	
}