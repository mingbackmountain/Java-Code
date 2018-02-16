//Thanakorn Pasangthien Section1 6088109
public class BankAccount_modified {
	
		private double balance;
		private Student owner;
		
		public BankAccount_modified(double Balance, Student Owner) {
			balance = Balance;
			owner = Owner;
		}
		public void deposit(double deposit) {
			balance = balance + deposit; 
		}
		public void withdraw(double withdraw) {
			balance = balance - withdraw;
		}
		public double getBalance() {
			return balance;
		}
		public Student getOwner() {
			return owner;
		}
		public String getOwnerName() {
			return owner.getname();
		}
		public String getOwnerEmail() {
			return owner.getemail();
		}
		public String toSting() {
			return "Account"+"["+"owner = "+owner.getname()+","+"email = "+owner.getemail()+" balance = "+balance+"]";
		}
}
