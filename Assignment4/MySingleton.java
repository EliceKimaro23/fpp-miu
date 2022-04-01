package assignment4;

public class MySingleton {
	// static variable reference of single instance of type singleton

	private static MySingleton single_instance = null;
	// Declaring variable of type string
	public String s;

	// a private constructor that is restricted to this class itself

	private MySingleton() {

	}
	// a static method that has object as a return type

	public static MySingleton getInstance() {
		if (single_instance == null)
			single_instance = new MySingleton();
		return single_instance;
	}

	public static void main(String[] args) {
		// instantiating singleton class with variable x,y and z
		
		MySingleton x = MySingleton.getInstance();	
		MySingleton y = MySingleton.getInstance();
		MySingleton z = MySingleton.getInstance();
		
		// printing the hashcodes for above variables as declared
		System.out.println("x :" + x.hashCode());
		System.out.println("y :" + y.hashCode());
		System.out.println("z :" + z.hashCode());
		
		// checking if the objects point to same memory location
		
		if (x==y  && y==z) {
			System.out.println("SAME MEMEORY LOCATION");
		}
		
		
		
	}

}
