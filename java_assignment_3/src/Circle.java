//Thanakorn Pasangthien Section1 6088109 
public class Circle {
	private double radius;
	private Point center;
	Circle(Point center,double radius){
		this.radius = radius;
		this.center = center;
	}
	public Point getCenter() {
		return center;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "Circle[ceter = ("+this.getCenter().getX()+","+this.getCenter().getY()+")"+","+"radius = "+this.getRadius()+"]";
	}
	public boolean contains(Point p) {
		double d = Math.pow((p.getX()-this.getCenter().getX()), 2)+Math.pow((p.getY()-this.getCenter().getY()), 2);
		if(Math.sqrt(d)<radius) {
			return true;
		}else {
			return false;
		}
	}
	public boolean contains(Circle c) {
		 double d = Math.pow(this.getCenter().getX()-c.getCenter().getX(), 2)+Math.pow(this.getCenter().getY()-c.getCenter().getY(), 2);
		 double sumRsqure = Math.pow(this.getRadius()+c.getRadius(), 2);
		 if(d<sumRsqure) {
			 return true;
		 }else {
			 return false;
		 }
	}
}
