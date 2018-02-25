public class Triangle extends Shape {
	private double base;
	private double height;
	  public Triangle() {
		  super.getColor();
	  }
	   public Triangle(String color, double base, double height) {
		   	  super.setColor(color);
			  this.base = base;
			  this.height = height;
	   }

	   @Override
	   public String toString() {
	      return "Rectangle"+"["+"base="+this.base+","+"height="+this.height+","+"Shape"+"["+"color="+super.getColor()+"]"+"]";
	   }

	   // Override the inherited getArea() to provide the proper implementation
	   @Override
	   public double getArea() {
	      double area = 0.5*this.base*this.height;
	      return area;
	   }

	   public double getArea(double base, double height) {
		   this.base = base;
		   this.height = height;
		   return getArea();
		}
}
