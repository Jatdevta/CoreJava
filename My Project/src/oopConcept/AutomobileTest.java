package oopConcept;

public class AutomobileTest {
	public static void main(String[] args) {
		Automobile m = new Automobile();
		m.setColor("Red");
		System.out.println(m.getColor());
		
		m.setMake("Tractor");
		System.out.println(m.getMake());
		
		
		m.setSpeed(50);
		System.out.println("Initial speeed "+m.getSpeed());
		
		m.Break(20);
		m.Acceleration(20);
		 
		
		int s = m.getSpeed(); //initial speed
		int x = s+30;			//2nd gear
		int y = s+30;			//3rd gear
		int z = s+30;			//4th gear
		
		if(gear()==1) {
			System.out.println("Speed is 1st gear is : "+s+" km/h");
			}
		else if (gear()==2) {
			System.out.println("Speed is 2nd gear is : "+x+" km/h");
		}
		else if (gear()==3) {
			System.out.println("Speed is 3rd gear is : "+y+" km/h");
		}
		else if (gear()==4) {
			System.out.println("Speed is 2nd gear is : "+z+" km/h");
		}
		
	}

	private static int gear() {
		
		return 3;
	}
}