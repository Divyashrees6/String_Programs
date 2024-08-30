package string_programs;
public class StrReverse {

	public static void main(String[] args) {
	      String input = "Atul";
	      String output="";
	      for(int i=input.length()-1;i>=0;i--)
	      { 
	  	    char c1 = input.charAt(i);   // printing in char (c1).
	  	    output=output+c1;			//formula to print output in string only.
	      }
	      
	  System.out.print("The reverse of string is  " +output);  //outside of for loop
	  
	}
}

