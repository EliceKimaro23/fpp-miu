package assignment2;

public enum AccountType {

	CHECKING("checking"),SAVING ("saving"), RETIREMENT("Retirement");
	AccountType (String string){
		
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType (String accountType) {
		this.accountType = accountType;
	}
	
	private String accountType;
}
