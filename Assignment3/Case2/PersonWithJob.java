package Case1;

import java.util.GregorianCalendar;
import java.util.Objects;

public class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String name, GregorianCalendar dob, double s) {
		super(name, dob);
		this.salary = s;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean Equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof PersonWithJob))
			return false;
		PersonWithJob pw = (PersonWithJob)o;
		return Objects.equals(this.getName(), pw.getName() )&&  Objects.equals(this.getDateOfBirth(), pw.getDateOfBirth());
	}

}
