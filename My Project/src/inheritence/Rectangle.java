package inheritence;

public class Rectangle extends Shape{
	private int length = 0;
	private int width = 0;
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public void area() {
		int area =getLength()*getWidth();
		System.out.println("Rectangle Area : "+area);
		
	}
}
