package basicProgram;

public class Counting1to100 {
	public static void main(String[] args) {
		
	
		int i =0;
		int j=0;
		int d=1;
		for ( i = 1; i <= 10; i++) {
			for ( j = 1; j <=10; j++) {
				if(d<=100) {
				System.out.print(d+" \t");
				d++;
			}
			}
			System.out.println( "  ");
		}
	}

	}
