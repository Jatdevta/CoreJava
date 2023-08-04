package exceptionHandling;

public class TestInvaliduser {
	public static void main(String[] args)  {
		 String name = "Rahul";
		try {
			if(name.equals(name)) {
				System.out.println("Valid User");
			}
			else
			{
				throw new InvalidUser();
			}
			
		} 
		catch (Exception e)
		{ e.printStackTrace();
		    }
	System.out.println("Raj..........!!!!!");
		}
	
}

