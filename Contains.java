package string_programs;

import java.util.Arrays;
public class Contains {
	public static void main(String[] args) {

		String a1="Divya Shree Mandya bangalore";
		boolean answer = a1.contains("Shree");
		System.out.println(answer);          // contains
		
		String [] name =a1.split(" ");
		System.out.println(Arrays.toString(name));  //Split
		
		String [] name1 =a1.split(" ", 3);
		System.out.println(Arrays.toString(name1)); //splitting last 2 strings
		
		String x="Divya";
		System.out.println(x.repeat(2)); 
	}

}
