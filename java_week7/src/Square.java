public class Square extends Shape{
	   double side_one;
	   double side_two;
	   public Square() {
		  super.getColor();
	   }
	   public Square(String color,double side_one,double side_two) {
		   	  super.setColor(color);
			  this.side_one = side_one;
			  this.side_two = side_two;
	   }

	   @Override
	   public String toString() {
	      return "Square"+"["+"side_one="+this.side_one+","+"side_two="+this.side_two+","+"Shape"+"["+"color="+super.getColor()+"]"+"]";
	   }

	   // Override the inherited getArea() to provide the proper implementation
	   @Override
	   public double getArea() {
	      double area = this.side_one*this.side_two;
	      return area;
	   }

	   public double getArea(double side_one , double side_two) {
		   this.side_one = side_one;
		   this.side_two = side_two;
		   return getArea();
		}
}
