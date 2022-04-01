package Case1;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Person {
	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dateOfBirth ){
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	public boolean Equals(Object o) {
	 if (this== o)
		 return true;
	 if(!(o instanceof Person))
		return false;
	 Person p = (Person)o;
	 return 	Objects.equals(dateOfBirth,p.dateOfBirth) && Objects.equals(name,p.name);
	}
	

}