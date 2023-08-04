package inheritence;

public class TestShape {
	public static void main(String[] args) {
		
		Shape[] s =new Shape[2];
		s[0] = new Rectangle();		s[1] = new Circle();
		
		
		Rectangle r = (Rectangle)s[0];
		r.setLength(5);
		r.setWidth(20);
		
		Circle c =  (Circle)s[1];
		c.setRadius(5);
		
		for(int i =0; i<s.length;i++) {
			s[i].area();
		}
		
	}

}
