package stringHandling;

public class StringKeyword {
	public static void main(String[] args) {
		String s = "Rajendra Hajarilal jat ";
		
		System.out.println("String Length : " + s.length());
		System.out.println("7th Charcter : "+ s.charAt(6));
		System.out.println("Index of Hajarilal : "+s.indexOf("Hajarilal"));
		System.out.println("1 # pos of j: "+s.indexOf("j"));
		System.out.println("Last position of d: "+s.lastIndexOf("d"));
		System.out.println("R is Replaced by H: "+s.replace("R", "H"));
		System.out.println("Lower name: "+s.toLowerCase());
		System.out.println("Upper name;=: "+s.toUpperCase());
		System.out.println("Start with Rajendra: "+s.startsWith("Rajendra"));
		System.out.println("Father name:"+ s.substring(9));
	}

}
