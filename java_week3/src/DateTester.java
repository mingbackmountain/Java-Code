public class DateTester {
	public static void main(String[] args) {
		MyDate a = new MyDate();
		MyDate b = new MyDate(2016,2,28);
		MyDate c = new MyDate(2017,3,2);
		
		System.out.println("Object Number(a): "+a.getObjectNumber());
		System.out.println("a's Date: "+a.toString());
		System.out.println("a's Date: "+a.previousDay());
		System.out.println("a's Date: "+a.nextDay());
		System.out.println("a's Date: "+a.previousYear().previousMonth());
		System.out.println("a's Date: "+a.nextMonth().nextYear());
		a.setDate(2000, 4, 13);
		System.out.println("a's Date: "+a.toString());
		a.Getleapyear();
		System.out.println();
		
		System.out.println("Object Number(b): "+b.getObjectNumber());
		System.out.println("b's Date: "+b.toString());
		System.out.println("b's Date: "+b.nextDay());
		System.out.println("b's Date: "+b.nextDay());
		System.out.println("b's Date: "+b.nextYear());
		System.out.println("b's Date: "+b.nextMonth());
		System.out.println("b's Date: "+b.previousYear());
		b.Getleapyear();
		System.out.println();
		
		
		
		System.out.println("Object Number(c): "+c.getObjectNumber());
		System.out.println("c's Date: "+c.toString());
		System.out.println("c's Date: "+c.previousDay());
		System.out.println("c's Date: "+c.previousDay());
		System.out.println("c's Date: "+c.previousYear());
		System.out.println("c's Date: "+c.nextDay());
		System.out.println("c's Date: "+c.previousYear());
		c.Getleapyear();
		System.out.println();
	}
}
