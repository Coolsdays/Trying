package classNotes;

public class Circle extends Shape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}
	public Circle() {
		radius = 0;
	}
	public Circle(double x, double y, double radius) {
		super(x,y);
		setRadius(radius);
	}
	@Override
	public double findArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double findPerim() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String getShapeType() {
		return "circle";
	}
	@Override 
	public String toString() {
		return String.format("%s\t%.2f\t%.2f", getShapeType(), findArea(), findPerim());
	}

}
