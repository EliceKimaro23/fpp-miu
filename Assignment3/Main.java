package assignment3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		DeptEmployee [] d = new DeptEmployee [5];
		d[0] = new Professor("Arod", 12.00, 2020, 10, 10, 10);
		d[1]= new Professor ("Musa", 10.00, 2021, 10, 20, 10);
		d[2]= new Professor ("Emmy", 40.00, 2020, 10, 30, 10);
		d[3]= new Secretary ("Alice", 40.00, 2014, 10, 20, 200);
		d[4]= new Secretary ("Asma", 40.00, 2000, 3, 20, 200);
		Scanner sc = new Scanner (System.in);
		System.out.println("Do you wish to see the sum of all salaries in department :");
		char c = sc.next().charAt(0);
		for (DeptEmployee de: d)
			if (c == 'Y')
				System.out.println(de.getClass().getSimpleName() + de.computeSalary());
			else
				System.out.println("bye");
	}

}
