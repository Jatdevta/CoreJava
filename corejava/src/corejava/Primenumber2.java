package corejava;

public class Primenumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=11;
int sum=0;
for(int i=2;i<num -1;i++) {
	if (num%i== 0)
	{
		sum=sum+1;
		
	}
	if(sum==0) {
		System.out.println("Number is prime");
	}
	else {
		System .out.println("NOTprime");
		
		
	}
		
}
	}

}
