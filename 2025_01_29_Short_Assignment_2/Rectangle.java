
public class Rectangle extends Shape {
	private double length;
	private double height;
	
	public Rectangle(double x, double y, double l, double h) {
		super(x,y);
		this.length = l;
		this.height = h;
	}
	
	public XYPoint[] getCorners() {
		XYPoint[] corners = new XYPoint[4];
		XYPoint start = this.getPosition();
		corners[0] = start;
		corners[1] = new XYPoint(start.X + this.length, start.Y);
		corners[2] = new XYPoint(start.X, start.Y - this.height);
		corners[3] = new XYPoint(start.X + this.length, start.Y - this.height);
		return corners;
	}
	
	/*
	 * @pre factor >= 0
	 */
	public void resize(double factor) {
		this.length = this.length*factor;
		this.height = this.height*factor;
	}
	
	public double perimeter() {
		return 2*length + 2*height;
	}
	
	public double area() {
		return length*height;
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
			return this.length == ((Rectangle) o).length && 
					this.height == ((Rectangle) o).height;
		}
	}
}
