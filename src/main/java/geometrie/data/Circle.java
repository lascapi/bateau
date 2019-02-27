package geometrie.data;

public class Circle {
	private Point center;
	private double radius;
	public Circle() {
	}

	public Circle(Point center, double width) {
		this.center = center;
		this.radius = width;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double surface() {
		return 0.0;
	}

	public double perimeter() {
		return 0.0;
	}

	public boolean isInside(Point p) {
		return this.getCenter().distance(p) < this.getRadius();
	}

}