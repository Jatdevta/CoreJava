 package array;

public class TestArray3 {
	public static void main(String[] args) {
		String[] name = {"Hajari Lal Jat "};
		for(int i =0; i<name.length;i++) {
			//for(int j =name[i].length()-1;j>=0;j--) {
			for(int j=0; j<name[i].length(); j++) {
				System.out.print(name[i].charAt(j));
			}
		}
	}

}
 