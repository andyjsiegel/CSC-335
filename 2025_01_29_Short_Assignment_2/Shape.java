
public class Shape {
	private XYPoint position;
	
	public Shape(double x, double y) {
		this.position = new XYPoint(x,y);
	}
	
	public void translate(double xMove, double yMove) {
		XYPoint newPos = new XYPoint(position.X + xMove, position.Y + yMove);
		this.position = newPos;
	}
	
	public XYPoint getPosition() {
		return this.position;
	}
}
