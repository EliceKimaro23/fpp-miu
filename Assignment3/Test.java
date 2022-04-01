package assignment3;

public class Test {
	public static void main(String[] args) {
		
		ClosedCurve[] cc = { new Triangle (4, 5, 6), 
				new Circle (3),
				new Square (3), 
				new Rectangle(3, 7)};
		
		for (ClosedCurve tcr: cc) {
			double area = tcr.computeArea();
		String name = tcr.getClass().getSimpleName();
		System.out.println("The area of this " + " "+ name + " " + "is" + " " +  area);
		
		}
	}
	}