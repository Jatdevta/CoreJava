package constructor;

public class ConRectangle extends ConstructorShape{
	
	public ConRectangle() {
	}
	
	private int length;
	private int width;
	
	public ConRectangle(int length, int width) {
		
		this.length=length;
		this.width=width;
	
	}
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
	
	@Override
	public void area() {
		int rarea = getLength()*getWidth();
		System.out.println("Area of Rectangle : "+rarea);
		}
	
	
	

}
