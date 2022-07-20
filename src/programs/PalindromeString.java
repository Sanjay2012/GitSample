package programs;

public class PalindromeString {

	public static void main(String[] args) {
		palindromString("ABCDCBA");

	}
	
	public static void palindromString(String str) {
		String original_str=str;
		String rev_string="";
		
		int l=str.length();
		for (int i = l-1; i >=0; i--) {
			rev_string=rev_string+str.charAt(i);
		}
		System.out.println(rev_string);
		if (rev_string.equals(original_str)) {
			System.out.println("Palindrome String");
			
		}else {
			System.out.println("Not Palindrome String");
		}
	}

}
