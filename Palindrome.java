package string_programs;
public class Palindrome {

	public static void main(String[] args) {

		String input ="mom";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i); 
			output=output+c1;		
		}
		System.out.println("The reversed string is " +output);
		
		if(output.equals(input))
		{
			System.out.println("This is a palindrome " +output);
		}
		else
		{
		System.out.println("Not a palindrome");
		}
	}
}
