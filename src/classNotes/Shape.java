package classNotes;

public abstract class Shape {
	private double x;
	private double y;
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
	public Shape() {
		x = 0;
		y = 0;
	}
	public Shape(double x, double y) {
		setX(x);
		setY(y);
	}
	public abstract double findArea();
	public abstract double findPerim();
	public abstract String getShapeType();
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f", getShapeType(),x,y);
	}
}
