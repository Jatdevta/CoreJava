package typeCasting;

public class TestAcc {
	public static void main(String[] args) {
		TypeAccount a = new TypeAccount();
		a.setAccountType("Central Bank");
		a.setNumber("CENT123456");
		a.setBalance(8000);	
		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		System.out.println(a.getBalance());
		
		a.deposite(450);
		System.out.println("After Deposite = "+a.getBalance());
		
		a.withdraw(950);
		System.out.println("After Withdrwal= "+a.getBalance());
		
		a.fundtranfer(500);
		System.out.println("After Fndtrnfr= "+a.getBalance());
		
		a.Paybill(350.50);
		System.out.println("After paybill= "+a.getBalance());
	}

}
