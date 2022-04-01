package assignment3;

public class Test2 {
	public static void main(String[] args) {
		Polygon[] p = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 4), };
		for (Polygon tsr : p) {
			double perimeter = tsr.computePerimeter();
			String name = tsr.getClass().getSimpleName();
			int side = (int) tsr.getNumberOfSides();
			System.out.println("For this " + " " + name + "\n" + "Number of sides = " + side+ "\n " +"The perimeter is" + " " + perimeter  );
		}
	}

}
