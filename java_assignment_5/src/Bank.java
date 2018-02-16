//Thanakorn Pasangthien Section1 6088109
import java.util.ArrayList;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a);
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){
		double totalBalance = 0;
		for (int i = 0; i < accounts.size(); i++) {
			totalBalance += accounts.get(i).getBalance();
		}
		return totalBalance;
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		int number = 0;
		for (int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getBalance()>=atLeast) {
				number++;
			}
		}
		return number;
       
	}
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		//put your code here
		for (int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber()==accountNumber) {
				return accounts.get(i);
			}
		}
		return null;
	}
	//gets the bank account which has minimum balance.
    public BankAccount getMin(){
        double max = accounts.get(0).getBalance();
        for (int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getBalance()<max) {
				return accounts.get(i);
			}
		}
        return null;
    }	
}
