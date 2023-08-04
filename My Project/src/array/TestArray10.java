package array;

public class TestArray10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int [] table = { 2,4,6,8,10,12,16,18,20};
		int number =2;
		for(int i:table);
		for(int i = 0;i<table.length;i++) {
			if(table[i]==number) {
				System.out.println("index = "+i+" value = "+table[i]);
			}
		}

}
}