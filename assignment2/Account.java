package assignment2;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {

		// implement
		deposit += balance;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (amount > balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public AccountType getaccType() {
		return acctType;
	}

	public double getBalance() {

		return balance;
	}
	
}
