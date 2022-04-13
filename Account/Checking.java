
public class Checking extends Account implements AccountFeatures {

	
	public Checking(String accountNumber, String routingNumber, double balance) {
		super(accountNumber, routingNumber, balance);
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
			super.setBalance(super.getBalance() - amount);
			System.out.println("\t" + "Your new balance: " + super.getBalance());
			return true;
		} catch (InvalidAmountException ex) {
			System.out.println("\t" + ex.getMessage());
			return false;
		}
		
		
	}


}
