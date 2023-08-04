package exceptionHandling;

public class TestAccount {
	public static void main(String[] args) throws Account  {
		Account a = new Account();
		a.deposite(5000);
		a.wthdrawl(3000);
		//a.wthdrawl(3001);
	}

}
