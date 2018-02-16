//Thanakorn Pasangthien Section1 6088109
public class BankTester {

	public static void main(String[] args) {
		Bank bangkokbank = new Bank();
		bangkokbank.addAccount(new BankAccount(1001,20000));
		bangkokbank.addAccount(new BankAccount(1015,10000));
		bangkokbank.addAccount(new BankAccount(1729,15000));
		
		System.out.println("Total balance: " + bangkokbank.getTotalBalance());
		System.out.println("Account number with the largest balance: " + bangkokbank.getMin().getAccountNumber());
		System.out.println("Account number with having balance at least 15000: " + bangkokbank.countBalanceAtLeast(10000));
		System.out.println("Balance of matching account: " + bangkokbank.find(1729).getBalance());
	}

}
