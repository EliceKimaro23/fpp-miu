package assignment3;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	// an additional field
	private double overtimeHours;

	public Secretary(String name, double salary, int aYear, int aMonth, int aDay, double overtimeHours) {
		super(name, salary, aYear, aMonth, aDay);
		this.overtimeHours = overtimeHours;
	}
	// setters and getters

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double computeSalary() {
		return super.computeSalary() + (12 * overtimeHours);
	}

}
