package assignment3;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	private final static int SIDES = 4;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public double getNumberOfSides() {
	
		return SIDES;
	}
	@Override
	public double computePerimeter() {
		
		return side * 4;
	}


}
