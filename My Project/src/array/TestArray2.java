package array;

public class TestArray2{
	public static void main(String[] args) {
		String[] Ram = { "Rajendra","Ravindra"};
		int gin=0;
		for(String s:Ram) {
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='e') {
					gin++;
				}
			}
		}
System.out.println(gin);
 }
}