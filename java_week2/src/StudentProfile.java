// 6088109_Section1_Thanakorn
import java.util.Scanner;

public class StudentProfile {
	private String Name;
	private String Address;
	private int Age;
	private int studentID;
	private static int count = 0;
	StudentProfile(int id,int age,String address,String name){
		Name = name;
		Address =  address;
		Age = age;
		studentID = id;
		++count;
	}
	public void setStudentID(int id){
		studentID = id;
	}
	public void setAge(int age){
		Age = age;
	}
	public void setName(String name){
		Name = name;
	}
	public void setAddress(String address){
		Address = address;
	}
	
	public int getStudentID(){
		return studentID;
	}
	public int getAge(){
		return Age;
	}
	public String getName(){
		return Name;
	}
	public String getAddress(){
		return Address;
	}
	
	public void getAllInfo() {
		System.out.println(getStudentID());;
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getAddress());
		System.out.println("The number of student:"+count);
	}
	public int inputid() {
		 Scanner number = new Scanner(System.in);
		 System.out.println("Please enter id name age address");
		 int id = number.nextInt();
		 return id;
	}
	public int inputage() {
		 Scanner number = new Scanner(System.in);
		 int age = number.nextInt();
		return age;
	}
	public String inputname() {
		Scanner word = new Scanner(System.in);
		String name = word.nextLine();
		return name;
	}
	public String inputaddress() {
		Scanner word = new Scanner(System.in);
		String address = word.nextLine();
		return address;
	}
}
