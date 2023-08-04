package array;

public class TestArray4 {
	public static void main(String[] args) {
		String[] name = {"Hajari Lal Jat "};
		for(int i =0;i<name.length;i++) {
			for(int j=name[i].length()-1;j>=0;j--) {
				System.out.print(name[i].charAt(j) );
			}
		}
	}

}
