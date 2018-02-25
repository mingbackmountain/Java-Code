public class Circle extends Shape{
	   double radius;
	   public Circle() {
		  super.getColor();
	   }
	   public Circle(String color,double radius) {
		   	  super.setColor(color);
			  this.radius = radius;
	   }

	   @Override
	   public String toString() {
	      return "Circle"+"["+"radius="+this.radius+","+"Shape"+"["+"color="+super.getColor()+"]"+"]";
	   }

	   // Override the inherited getArea() to provide the proper implementation
	   @Override
	   public double getArea() {
	      double area = Math.PI*Math.pow(this.radius,2);
	      return area;
	   }

	   public double getArea(double radius) {
		   this.radius = radius;
		   return getArea();
		}
}
