package assignment2;

public class Triangle {
	private double base;
	private double height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {

		return base;
	}

	public double getHeight() {
		return height;
	}
	public double computeArea () {
	double	Area = 0.5 * base * height;
		return Area;
		
	}

}
