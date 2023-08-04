package array;

public class TestArray1 {
public static void main(String[] args) {
	String[] n = { "abcd","cxyz" };
	int count = 0;
	for(char c ='a'; c<='z';c++ ) {
		for(String s:n) {
			for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==c) {
				count++;
			}
			}
		}
		if(count>0) {
			System.out.println(c+"="+count);
		}
		count = 0;
	}
	
	
}
}