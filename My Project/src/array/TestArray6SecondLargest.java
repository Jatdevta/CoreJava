package array;

public class TestArray6SecondLargest {
	public static void main(String[] args) {
		
		int [] s= {700,500, 400,250,600	};
		int a = 0;
		int b = 0;
		for (int i = 0;i<s.length;i++) {
			if(s[i]>b) {
				a=b;
				b=s[i];
			}
			if(s[i]>a && s[i]<b) {
				a=s[i];
				
			}
		}
System.out.println("SecondLargest "+a);
}
}