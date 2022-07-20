package programs;

public class PalindromeNo {

	public static void main(String[] args) {
		checkPalindrome(456325);

	}
	
	public static void checkPalindrome(int num) {
		int original_num=num;
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if (original_num==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
