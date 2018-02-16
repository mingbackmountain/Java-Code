//Thanakorn Pasangthien Section1 6088109 
public class TestTime {
	public static void main(String[] args) {
		TimeSpan x = new TimeSpan(9,45 );
		TimeSpan y = new TimeSpan(1,45);
		System.out.println("Hours = "+x.getHours());
		System.out.println("Minute = "+x.getMinutes());
		x.add(1, 45);
		//x.add(y);
		System.out.println(x.getTotalHours());
		System.out.println(x.toString());
	}
}
