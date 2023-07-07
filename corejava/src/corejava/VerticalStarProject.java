package corejava;

public class VerticalStarProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;
for(i=1;i<=5;i++) //raws
{
	for(j=i;j<5;j++) //for space
	{
		System.out.print(" ");
	}
	for(k=1;k<=i;k++)//for colm
	{
		System.out.print("*");
	}
	System.out.println("");
}
	






int m,n,o;
for(m=1;m<=6 ;m++ ) {
	for(n=6;n<=1;n--) {
		System.out.print(" ");
		
	}
	for (o=1;o<=m;o++) {
		System.out.print("*");
	}
	System.out.println( " ");
}
}

}