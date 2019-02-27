package geometrie.data.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import geometrie.data.Point;

class TestPointEquals {

	private static List<Point> points;

//	@BeforeEach
	@BeforeAll
	static void init() {
		points = List.of(
				new Point(1d, 2d, "A"), // 0
				new Point(1d, 2d, "A"), // 1
				new Point(1d, 2d, "B"), // 2
				new Point(1d, 2d), // 3
				new Point(1d, 2d), // 4
				new Point(1d, 4d, "A"), 
				new Point(3d, 2d, "A"), 
				new Point(3d, 4d, "A"), 
				new Point(3d, 4d, "B"),
				new Point(1d, 4d), 
				new Point(3d, 2d)

		);
	}

	@Test
	void testEquals() {
		assertAll(
				() -> assertEquals(points.get(0), points.get(0)), 
				() -> assertEquals(points.get(0), points.get(1)),
				() -> assertEquals(points.get(1), points.get(0)), 
				() -> assertEquals(points.get(3), points.get(3)),
				() -> assertEquals(points.get(3), points.get(4)), 
				() -> assertEquals(points.get(4), points.get(3)));
	}

	@ParameterizedTest
	@MethodSource("pointPointsIndexesNotEqualsProvider")
	void testNotEquals(Point p, List<Integer> indexes) {
		assertAll(
			indexes.stream()
				.flatMap(
					i -> Stream.of(
					() -> assertNotEquals(p, points.get(i), p.toString()),
					() -> assertNotEquals(points.get(i), p, points.get(i).toString()
					)
				)
			)
		);
	}
	
	static Stream<Arguments> pointPointsIndexesNotEqualsProvider() {
		return Stream.of(
				//point 0 with Name
				arguments(points.get(0), List.of(2,3,5,6,7,8,9,10)),
				//point 3 with no name
				arguments(points.get(3), List.of(0,2,5,6,7,8,9,10)));
	}
}
