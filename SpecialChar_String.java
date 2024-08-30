package string_programs;

public class SpecialChar_String {
	 public static void main(String[] args) {
	        String str = "Divyashree  123 #$%^&*$()";

	        int specialCharCount = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
	                specialCharCount++;
	            }
	        }

	        System.out.println("Number of special characters: " + specialCharCount);
	    }
	}
