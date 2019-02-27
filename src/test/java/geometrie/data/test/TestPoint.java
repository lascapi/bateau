package geometrie.data.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import geometrie.data.Point;

class TestPoint {

	@ParameterizedTest
	@MethodSource("pointsAndExpectedValuesProvider")
	void testConstructorXYName(Point p, double x, double y, String name) {
		// double x = 2.1d;
		// double y = 4.5d;
		// String name = "A";

		// Point p = new Point(2.1, 4.5, "A");

		assertAll(() -> assertEquals(x, p.getX(), "x coord of Point"),
				() -> assertEquals(y, p.getY(), "y coord of Point"),
				() -> assertEquals(name, p.getName(), "name of Point"));
	}

	static DoubleStream doubleProvider() {
		// return DoubleStream.generate(Math::random).limit(1000L);
		return DoubleStream.iterate(1d, d -> 1.2d * d).limit(1000L);
	}

	static Stream<Arguments> pointsAndExpectedValuesProvider() {
		double x = 2.1d;
		double y = 4.5d;
		String name = "A";

		return Stream.of(
				arguments(new Point(x, y, name), x, y, name),
				arguments(new Point(x, y), x, y, null),
				arguments(new Point(), 0d, 0d, null)
				);

	}

	@Test
	void testConstructorXY() {
		double x = 2.1d;
		double y = 4.5d;
		String name = null;

		Point p = new Point(2.1, 4.5);

		assertAll(() -> assertEquals(x, p.getX(), "x coord of Point"),
				() -> assertEquals(y, p.getY(), "y coord of Point"),
				() -> assertEquals(name, p.getName(), "name of Point"));
	}

	@ParameterizedTest
	@ValueSource(doubles = { 1d, 2d, 5d })
	void testDistance(double factor) {
		double expectedDistance = factor * 5.0d;
		double xStart = 2.5d;
		double yStart = 4.6d;

		Point p1 = new Point(xStart, yStart, "A");
		Point p2 = new Point(xStart + 3d * factor, yStart + 4d * factor, "B");
		double actualDistance = p1.distance(p2);

		assertEquals(expectedDistance, actualDistance, "distance");
	}
}
