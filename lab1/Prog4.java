package assignment1;

public class Prog4 {
	public static void main(String[] args) {

		String myString = Data.records;
		String[] row = (myString.split(":"));
		for (String x : row) {
			String[] columns = x.split(",");
			System.out.println(columns[0]);
		}

	}
}