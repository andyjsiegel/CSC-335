
public class Circle extends Shape {
	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	/*
	 * @pre factor >= 0
	 */
	public void resize(double factor) {
		this.radius*=factor;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		else if(o == this)
			return true;
		else if(o.getClass() != getClass())
			return false;
		else {
			return this.radius == ((Circle) o).radius;
		}
	}
}
