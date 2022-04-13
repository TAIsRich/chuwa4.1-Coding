
public abstract class Account {
	
	private String accountNumber;
	private String routingNumber;
	private double balance;
	
	public Account(String accountNumber, String routingNumber, double balance ) {
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return 	"Account Number: " + accountNumber + "\n" +
				"Routing Number: " + routingNumber + "\n" +
				"Balance: " + balance;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account other = (Account) obj;			
			if(accountNumber.equalsIgnoreCase(other.accountNumber) && 
					routingNumber.equalsIgnoreCase(other.routingNumber) && 
					balance == other.balance) {
				return true;
			} else {
				return false;
			}		
		} else {
			return false;
		}
	}
}
