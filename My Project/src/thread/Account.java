package thread;

public class Account {
	 private int balance;
	
	 public void setBalance(int balance) {
		try {
			Thread.sleep(400);
			
		}
		catch ( Exception e) {
		} 
		 
		this.balance = balance;
	}
	 public int getBalance() {
		 try {
			Thread.sleep(500);
		}
		 catch (Exception e) {
		}
		return balance;
	}
	 
	 public void deposite(String name,int amount) {
		 int total= getBalance()+amount;
		 setBalance(total);
		 System.out.println(name+"balance"+getBalance());
	}
}
