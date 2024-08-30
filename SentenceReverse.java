package string_programs;

public class SentenceReverse {

	public static void main(String[] args) {

		String input="My name is Divya";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
		 char c1= input.charAt(i);
		 output=output+c1;
		 
		}
		System.out.println("The reversed string is  " +output);
	}

}
