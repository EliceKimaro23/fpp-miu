package assignment4;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	//returns the value in the instance variable of Bottom
	int readBottom() {
		//implement
		this.mid = new Middle();
		this.midbot = mid.new Bottom ();
		return midbot.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance variable in Top and 
		//instance variable in Bottom
		int addTopAndBottom() {
			//implement
			
		int sum =	midbot.b + t;
			return sum;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance variables
			//in all three classes
			int multiplyAllThree() {
				//implement
				int product = t * m *b;
				return product;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}

}