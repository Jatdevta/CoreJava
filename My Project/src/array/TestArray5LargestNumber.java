package array;

public class TestArray5LargestNumber {
	public static void main(String[] args) {
		int [] s= {55,100,120,134,332};
		
		int largest=0;
		for(int i =0;i<s.length;i++) {
			if(s[i]>largest) {
			largest=s[i];	
			}
		}
	
		System.out.println( "Largest Number = "+largest);
}
}