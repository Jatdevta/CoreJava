package typeCasting;

public class IntegerToString {
	public static void main(String[] args) {
		int i1=200;
		int i2=300;
		String s1=String.valueOf(i1);
		
		
		String s2=String.valueOf(i2);
		System.out.println(i1+i2);
	
//-------------type2-----------------------------------------------------------------------------------------------------------------------------
//---------------String to Integer-----------------------------------------------------------------------------------------------------------------------------
	
	String sr1= "100";
	int j1 = Integer.parseInt(sr1);
	String sr2="200";
	int j2 = Integer.parseInt(sr2);
	
	System.out.println(sr1+sr2);
	System.out.println(j1+j2);
}
}