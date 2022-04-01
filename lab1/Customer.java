package assignment1;

public class Customer {
	// attributes for class customer
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;

	

	

	public Customer(String firstName, String lastName, String socSecurityNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	
	}
	// getters methods
	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {

		return lastName;
	}

	public String getsocSecurityNum() {
		return socSecurityNum;
	}

	public Address getbillingAddress() {
		return billingAddress;
	}

	public Address getshippingAddress() {
		return shippingAddress;
	}

	// Setters methods
	public void setfirstName(String fname) {
		firstName = fname;

	}

	public void setlastName(String lname) {
		lastName = lname;
	}

	public void setsocSecurityNum(String ssn) {
		socSecurityNum = ssn;

	}

	public void setbillingAddress(Address billing) {
		billingAddress = billing;

	}

	public void setshippingAddress(Address shipping) {
		shippingAddress = shipping;

	}

	@Override
	public String toString() {
		return "[" + firstName + "," + " " + lastName + "," + " " + "ssn:" + socSecurityNum + "]";
	}

}
