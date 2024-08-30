package string_programs;

public class InterviewStrings {
	public static void main(String[] args) {

		String a ="Manish";
		String b ="Manish Kumar Tiwari";
		String c ="Divya Shree";
		String d ="ka 11 Mandya";
		
		System.out.println(a.replace("M","z"));
        System.out.println(b.replace(" ",""));	
        System.out.println(c.replaceAll("[A-Z]", " "));
        System.out.println(b.replaceAll("[a-z]",""));
        System.out.println(d.replaceAll("[0-9]",""));
        
	}

}
