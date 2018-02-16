//Thanakorn Pasangthien Section1 6088109 
public class BankAccount {
	private String id;
	private double balance;
	private int transactions;
	
	public BankAccount(String id) {
		this.id = id;
		balance = 0;
		transactions = 0;
	}
	public double getBalance() {
		return balance;
	}
	public String getID() {
		return id;
	}
	public String getTransactions() {
		return Integer.toString(transactions);
	}
	public void deposit(double amount) {
		if(amount>=0 && amount<=500) {
			balance += amount;
			transactions++;
		}
	}
	public void withdraw(double amount) {
		if(balance>amount) {
			balance -= amount;
			transactions++;
		}
	}
	public boolean transactionFee(double amount) {
		int i = 0;
		double sub = 0;
		while(i<transactions) {
			sub += amount;
			balance -= sub;
			if(balance<0) {
				balance = 0;
				break;
			}
			i++;
		}
		System.out.println(amount);
		if(balance>0) {
			return true;
		}else{
			return false;
		}
	}
}
