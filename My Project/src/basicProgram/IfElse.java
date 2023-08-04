package basicProgram;

public class IfElse {
	public static void main(String[] args) {
		int marks = 32;
		if(marks<=32) {
			System.out.println("Fail");
		}
		else if(marks >= 90 && marks <100) {
			System.out.println("A+ grade");
		}
		else if (marks >=70 && marks <90) {
			System.out.println("A grade");
		}
		else if (marks >=60 && marks <70) {
		System.out.println("B+");	
		}
		else if (marks >=50 && marks <60) {
			System.out.println("B");
		}
		else if (marks >=33 && marks <50) {
			System.out.println("C");
		}
	}

}
