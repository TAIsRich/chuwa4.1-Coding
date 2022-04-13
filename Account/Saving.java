
public class Saving extends Account implements AccountFeatures{

	private double minBalance;
	
	public Saving(String accountNumber, String routingNumber, double balance, double minBalance) {
		super(accountNumber, routingNumber, balance);
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\n" +
				"Have to maintain minimum balance:  " + minBalance;
	}

	@Override
	public boolean deposit(double amount) {
		try {
			System.out.println("Deposit $ "+ amount + " ... ");
			if (amount < 0) {
				throw new InvalidAmountException("Can't deposit Negative amount.");
			}			
			super.setBalance(super.getBalance() + amount);
			System.out.println("\t" + "Your new balance: " + super.getBalance());
			return true;
		} catch (InvalidAmountException ex) {
			System.out.println("\t" + ex.getMessage());
			return false;
		}
	}

	@Override
	public boolean withdrawl(double amount) {
		try {
			System.out.println("Withdrawl $ "+ amount + " ... ");
			if (amount < 0) {
				throw new InvalidAmountException("Can't withdrawl Negative amount.");
			}
			if (amount > super.getBalance()) {
				throw new InvalidAmountException("Not enough money to withdrawl");
			}
			if (super.getBalance() - amount < minBalance) {
				throw new InvalidAmountException("Can't withdrawl. Blance will be less than the required minimum balance");
			}
			
			super.setBalance(super.getBalance() - amount);
			System.out.println("\t" + "Your new balance: " + super.getBalance());
			return true;
		} catch (InvalidAmountException ex) {
			System.out.println("\t" + ex.getMessage());
			return false;
		}
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Saving other = (Saving) obj;						
			return super.equals(obj) && minBalance == other.minBalance;		
		} else {
			return false;
		}
		
	}

}
