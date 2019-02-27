package geometrie.data;

public class Point {

	// Variable
	private double x;
	private double y;
	private String name;

	// Constructeur
	public Point() {
		//appel du constructeur avec tout les paramètres
		this(0.0d, 0.0d, null);
	}

	public Point(double x, double y) {
		this(x, y, null);
	}

	public Point(double x, double y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}

	// Getter Setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Methode metier
	public double distance(Point other) {
		return Math.hypot(
				this.getX() - other.getX(), 
				this.getY() - other.getY()
		);
	}
	
	public void translater(double deltaX, double delatY) {
		// TODO
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	

}
