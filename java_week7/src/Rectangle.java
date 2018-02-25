public class Rectangle extends Shape {
   double length;
   double width;
   public Rectangle() {
	  super.getColor();
   }
   public Rectangle(String color, double length, double width) {
	   	  super.setColor(color);
		  this.length = length;
		  this.width = width;
   }

   @Override
   public String toString() {
      return "Rectangle"+"["+"length="+this.length+","+"width="+this.width+","+"Shape"+"["+"color="+super.getColor()+"]"+"]";
   }

   // Override the inherited getArea() to provide the proper implementation
   @Override
   public double getArea() {
      double area = this.length*this.width;
      return area;
   }

   public double getArea(double length, double width) {
	   this.length = length;
	   this.width = width;
	   return getArea();
	}
}
