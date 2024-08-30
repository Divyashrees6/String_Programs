package string_programs;

public class String_Functions {

	public static void main(String[] args) {

		String d1=new String("  Divya shree   d   ");
		System.out.println(d1);
		System.out.println(d1.length()); 			 // string length
		System.out.println(d1.charAt(2)); 			// character at Index
		System.out.println(d1.indexOf('s')); 		// Index of char 
		System.out.println(d1.toUpperCase());   	// UPPERCASE
		System.out.println(d1.toLowerCase());    	//lowercase 
		System.out.println(d1.trim());              // trimming space
	}

}

