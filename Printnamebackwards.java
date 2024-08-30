package string_programs;
import java.util.Scanner;
public class Printnamebackwards {

	public static void main(String[] args) {
           Scanner s1= new Scanner(System.in);
           System.out.print("Enter the String name ");
           String input = s1.next();
           s1.close();
           
        for (int i = input.length() - 1; i >= 0; i--) {
              System.out.println(input.charAt(i));
          }
	}              
	}

/* String name1="Divya";
for(int i=name1.length()- 1; i >=0; i--)
{ 
	  char a1=name1.charAt(i);
    System.out.println(a1);
} */