//Thanakorn Pasangthien Section1 6088109
public class BankTester_2 {
	public static void main(String[] args) {
		Student x = new Student("Ming","mingbackmountain@gmial.com");
		Student y = new Student("Poly","Polymountain@gmial.com");
		BankAccount_modified myaccount = new BankAccount_modified(2000,x);
		System.out.println(myaccount.getBalance());
		System.out.println(myaccount.getOwner().getname());
		System.out.println(myaccount.getOwner().getemail());
		System.out.println(myaccount.getOwnerName());
		System.out.println(myaccount.getOwnerEmail());
		System.out.println(myaccount.toSting());
		
	}
}
