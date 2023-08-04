package clonning;

public class TestAccount {
	public static void main(String[] args) throws CloneNotSupportedException {
			
		Account a = new Account(20);
		Account a1 = new Account(30);
		
		a1 = a;
		a1 =(Account) a.clone();
		a1.balance = 15;
		
		System.out.println(a.balance);
		System.out.println(a1.balance);
	}

}
