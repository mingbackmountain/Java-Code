//Thanakorn Pasangthien Section1 6088109
public class BankAccount {
	public double balance;
	
	public BankAccount() {
		balance = 0;
	}
	public void deposit(double deposit) {
		balance = balance + deposit; 
	}
	public void withdraw(double withdraw) {
		balance = balance - withdraw;
	}
	public double getBalcne() {
		return balance;
	}
}
