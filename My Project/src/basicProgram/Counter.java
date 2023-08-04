package basicProgram;
public class Counter{

public static int Count ;

public static int nextnumber() {
	return ++Count ;
}

 
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(" Ab  "+ Counter.nextnumber());
		}
		
		
		}

}
