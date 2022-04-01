package assignment1;

public class Main {
	public static void main(String[] args) {
		
// creating address fields
		Address a2 = new Address("100", "Illinos", "Chicago", "52556");
		Address a3 = new Address("10", "Burlington", "Fairfield", "52558");
		
		
// instance of customers
		Customer c = new Customer("David", "James", "123-534-278");
		c.setbillingAddress(a3);
		c.setshippingAddress(a2);
		Customer c2 = new Customer("Alice", "Kimaro", "234-196-222");
		c2.setbillingAddress(a2);
		c2.setshippingAddress(a3);

		// creating customer array and printing out the name of the customer whose billing address is Chicago.

		Customer[] cus = new Customer[2];
		cus[0] = c;
		cus[1] = c2;

		for (int i = 0; i < cus.length; i++) {
			Address state = cus[i].getbillingAddress();
			if (state.equals(a2)) {
				System.out.println(cus[i].toString());
				
			}
		}

	}

}
