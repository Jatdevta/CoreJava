package basicProgram;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 11;
		int Count  = 0;
		
		for (int i = 2; i <number; i++) {
			if(number % i ==0) {
			//	Count++;
				}
		}
			if (Count ==0) {
				System.out.println("prime"+number);
			}
			else {
				System.out.println("Not prime");
			}
		}
	}


