package assignment2;

public class Rectangle {
	private double width;
	private double lenght;
	
	public Rectangle (double width, double lenght) {
		
		this.width = width;
		this.lenght = lenght;
	}
	
	public double getWidth () {
		return width;
	}
	
	public double getLength () {
		return lenght;
	}
	
	public double computeArea() {
		
		double Area = width * lenght;
		return Area;
	}

}
