package exceptionHandling;

public class Account extends Exception {
	private double balance ;
	
	public Account () {
		super("Insufficient balance");
		System.out.println("insufficient balance");
		}
		
	public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getBalance() {
			return balance;
		}
		
		public void deposite(double d) {
			balance=balance+d;
			System.out.println("deposite amount : "+d);
		}
		public void wthdrawl(double amt) throws Account   {
			if((balance -amt)<2000) {
				throw new Account();
			}
			else 
			{
			balance = balance-amt;
			System.out.println("withdrawl amount is :"+ amt);
			System.out.println("Current Balance is : "+ balance);
			
		}
	
	
}
}