package string_programs;

public class String_Match {
	public static void main(String[] args) {

		String a="ramu";
		System.out.println(a.matches("r(.*)"));
		
	     System.out.println("....");   
	     
	     System.out.println(a.matches("(.*)u"));
	     
	     System.out.println(a.matches("(.*)m(.*)"));
	}

}
