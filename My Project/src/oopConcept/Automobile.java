package oopConcept;

public class Automobile {
	private String Color ;
	private int speed =0;
	private String make ;
	
	
	public void setColor(String color) {
		Color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return Color;
	}
	public int getSpeed() {
		return speed;
	}
	public String getMake() {
		return make;
	}
	  public void Break (double d ) {
		if(speed >=d) {
			System.out.println("Break : "+(speed-10));
		}
	}
	public void Acceleration(double d) {
		if(speed<=d) {
			System.out.println("Acceleration : "+(speed+10));
		}
	}

}
