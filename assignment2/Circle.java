package assignment2;

public class Circle {
	private double radius;

	public Circle(double radius) {

		this.radius = radius;
	}
	public double getRadius () {
		return radius;
	}
public double computeArea () {
	
	double Area =Math.PI * radius * radius;
	return Area;
}
}
