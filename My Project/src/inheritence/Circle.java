package inheritence;

public class Circle extends Shape {
	private int radius;
	public static final double PI = 3.14;
	
	 public void setRadius(int radius) {
		this.radius = radius;
	}
	 public int getRadius() {
		return radius;
	}
	 public void area () {
		 double area = (int) (PI* getRadius()*getRadius());
		 System.out.println("Area of circle: "+area);
	 }

}
