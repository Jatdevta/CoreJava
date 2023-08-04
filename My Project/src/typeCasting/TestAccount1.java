package typeCasting;

public class TestAccount1 {
	public static void main(String[] args) {
		TypeAccount a = new TypeAccount();
		a.setAccountType("Axis Bank");
		a.setNumber("92100200");
		a.setBalance(4000);
		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		System.out.println(a.getBalance());
		
		if(a.getBalance()>5000) {
			System.out.println("Your Current Balance is : "+a.getBalance());
		}
		else {
			System.out.println("insufficient balance: "+a.getBalance());
		
		}
	}

}