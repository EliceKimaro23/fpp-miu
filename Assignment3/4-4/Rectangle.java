package assignment3;

public class Rectangle extends ClosedCurve implements Polygon{
	double width; 
	double length;
	private final static int SIDES = 4;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double computeArea() {
		
		return width*length;
	}

	@Override
	public double computePerimeter() {
		
		return (width*2)+ (length*2);
	}

	@Override
	public double[] getArrayOfSides() {
		double [] sides = {width,length,width,length};
		return sides;
	}

}
