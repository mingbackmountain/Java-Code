//Thanakorn Pasangthien Section1 6088109 
public class Banktest {
	public static void main(String[] args) {
		BankAccount savings = new BankAccount("Ming");
		savings.deposit(10);
		savings.deposit(50);
		savings.deposit(10);
		savings.deposit(70);
		System.out.println(savings.getBalance());
		System.out.println(savings.transactionFee(5));
		System.out.println(savings.getBalance());
		System.out.println(savings.transactionFee(10));
		System.out.println(savings.getBalance());	
	}
}
