// 6088109_Section1_Thanakorn
public class ManageStudent {

	public static int ageDiff(int std1,int std2) {
		int agediff;
		if(std1>std2) {
			agediff = std1-std2;
		}else if(std2>std1) {
			agediff = std2-std1;
		}else {
			agediff = 0;
		}
		return agediff;
		
	}
	public static void main(String[] args) {

	  
	  StudentProfile student1 = new StudentProfile(6088109,20,"Ming","Banpong Rachaburi");
	  StudentProfile student2 = new StudentProfile(6088133,17,"Ploy","OOO Bangkok");
	 
	  student1.getAllInfo();
	  student2.getAllInfo();
	  System.out.println("The difference of Age is "+ageDiff(student1.getAge(),student2.getAge()));
	  
	  student1.setStudentID(student1.inputid());
	  student1.setAge(student1.inputage());
	  student1.setName(student1.inputname());
	  student1.setAddress(student1.inputaddress());
	  
	  student2.setStudentID(student2.inputid());
	  student2.setAge(student2.inputage());
	  student2.setName(student2.inputname());
	  student2.setAddress(student2.inputaddress());
	  
	  student1.getAllInfo();
	  student2.getAllInfo();
	  System.out.println("The difference of Age is "+ageDiff(student1.getAge(),student2.getAge()));
	

	}

}
