package constructor;

public class ConCircle extends ConstructorShape {
	public ConCircle() {
		}
	public static final double PI = 3.14;
	
	int radius ;
	 
	public ConCircle (int radius) {
		this.radius=radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	@Override
	public void area() {
		double Carea = PI*getRadius()*getRadius();
		System.out.println("Area of Circle : "+Carea);
		
	}

}
