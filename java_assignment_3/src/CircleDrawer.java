//Thanakorn Pasangthien Section1 6088109 
public class CircleDrawer {
	public static void main(String[] args) {
		////Point Class
		Point k = new Point();
		Point m = new Point();
		k.setPoint(2, 8);
		m.setPoint(4, 7);
		System.out.println("manhattanDistance = "+k.manhattanDistance(m));
		k.setPoint(9, 4);
		m.setPoint(5, 3);
		System.out.println("manhattanDistance = "+k.manhattanDistance(m));
		k.setPoint(10, 5);
		m.setPoint(7, 6);
		System.out.println("manhattanDistance = "+k.manhattanDistance(m));
		k.setPoint(8, 9);
		m.setPoint(15, 11);
		System.out.println("manhattanDistance = "+k.manhattanDistance(m));
		k.setPoint(10, 11);
		m.setPoint(12, 17);
		System.out.println("manhattanDistance = "+k.manhattanDistance(m));
		
		/////Circle Class
		Point O = new Point();
		Point J = new Point();
		O.setPoint(5, 10);
		Circle x = new Circle(O, 8);
		Circle y = new Circle(J,2);
		Circle z = new Circle(O,12);
		System.out.println("("+x.getCenter().getX()+","+x.getCenter().getY()+")");
		System.out.println("Radius = "+x.getRadius());
		System.out.println("Area = "+x.getArea());
		System.out.println("Circumference = "+x.getCircumference());
		System.out.println(x.toString());
		J.setPoint(2,3);
		System.out.println("This point is in circle = "+x.contains(J));
		J.setPoint(15,13);
		System.out.println("This point is in circle = "+x.contains(J));
		
		System.out.println("Collapse = "+x.contains(y));
		System.out.println("Collapse = "+z.contains(y));
		
	}
}
