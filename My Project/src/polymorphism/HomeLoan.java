package polymorphism;

public class HomeLoan {
	public static void main(String[] args) {
		Bank[] b = new Bank[4];
		b[0] = new AxisBank();
		b[1] = new HDFCBank();
		b[2] = new ICICIBank();
		b[3]= new SBIBank();
		
		loanEnqiry(b);
	}
	static void loanEnqiry(Bank[] b) {
		for(Bank m : b) {
			String name =m.getName();
			double rate = m.interestRate();
			System.out.println(name+" = "+rate);
			
		}
	}

}
