package assignment3;

import java.time.LocalDate;

public class DeptEmployee {
	// instance fields
	private String name;
	private double salary;
	private LocalDate hiredate;
	
	// constructor;
	
	public DeptEmployee (String name, double salary, int aYear, int aMonth, int aDay) {
		this.name = name;
		this.salary = salary;
		this.hiredate = LocalDate.of(aYear, aMonth, aDay);
	}
// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		
		return salary;
	}
	
	
	
	

}
