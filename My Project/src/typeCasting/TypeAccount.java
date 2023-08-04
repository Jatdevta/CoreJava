package typeCasting;

public class TypeAccount {
	 private String number;
	 private String accountType;
	 private double balance;
	 
	 public String getNumber() {
		return number;
	}
	 public void setNumber(String number) {
		this.number = number;
	}
	 	public String getAccountType() {
			return accountType;
		}
	 	public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
	 	public double getBalance() {
			return balance;
		}
	 	public void setBalance(double balance) {
			this.balance = balance;
		}
	 	public void withdraw(int w) {
	 	balance=balance -w; 
		}
	 	public void fundtranfer(int f) {
	 	balance =balance -f; 
		}
	 	public void deposite(double d) {
	 	balance =balance+d;
		}
	 	public void Paybill(double p) {
	 	balance=balance-p;
		}
}       
