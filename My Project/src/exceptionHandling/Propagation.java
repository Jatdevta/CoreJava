package exceptionHandling;

public class Propagation {
	public static void main(String[] args) throws TestPropagationGalti
	{
		Father();
	}
	public static void Father() throws TestPropagationGalti
	{
		Mother();
	}
	public static void Mother() throws TestPropagationGalti
	{
		Son();
	}
	public static void Son() throws TestPropagationGalti
	{
		throw new TestPropagationGalti();
	}

}
