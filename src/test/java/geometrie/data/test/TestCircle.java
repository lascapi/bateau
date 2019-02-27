package geometrie.data.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import geometrie.data.Circle;
import geometrie.data.Point;

class TestCircle {

	@ParameterizedTest
	@ValueSource(doubles = { 3.25 })
	void testIsInsideTrue(double x) {
		Point pc = new Point(2.25, 4.5);
		Circle c = new Circle(pc, 10.75);
		Point pv = new Point(x, 4.5, "Variable");
		assertTrue(c.isInside(pv));
	}

	@ParameterizedTest
	@ValueSource(doubles = { 13, 14.75 })
	void testIsInsideFalse(double x) {
		Point pc = new Point(2.25, 4.5);
		Circle c = new Circle(pc, 10.75);
		Point pv = new Point(x, 4.5, "Variable");
		assertFalse(c.isInside(pv));
	}
	
	@RepeatedTest(1000)
	void testInsideTrueN() {
		double xCenter = 1d;
		double ycenter = 2d;
		double radius = 2d;
		double module = radius * Math.random();
		double arg = Math.PI * 2 * Math.random();
		
		Point pA = new Point(xCenter, ycenter);
		Circle circle = new Circle(pA, radius);
		Point pB = new Point(
				xCenter + module * Math.cos(arg),
				ycenter + module * Math.sin(arg),
				"B"
				);
		assertTrue(circle.isInside(pB), pB.toString());
				
	}

}