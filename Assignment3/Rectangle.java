package assignment3;

public class Rectangle extends ClosedCurve{
	double width; 
	double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double computeArea() {
		
		return width*length;
	}

}
