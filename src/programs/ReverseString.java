package programs;

public class ReverseString {

	public static void main(String[] args) {
		reverse1("Sanjay");
		reverse2("Made Easy CTC");
		reverse3("Welcome to Java");

	}
	
	public static void reverse1(String str1) {
		String rev="";
		int len=str1.length();
		for (int i = len-1; i >=0; i--) {
			rev=rev+str1.charAt(i);
		}
		System.out.println("Reverse String :"+rev);	
	}
	
	
	public static void reverse2(String str2) {
		char a[]=str2.toCharArray();
		String rev="";
		int len=str2.length();
		for (int i = len-1; i >=0; i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse String :"+rev);
	}
	
	
	public static void reverse3(String str3) {
		StringBuffer sb=new StringBuffer(str3);
		StringBuffer rev= sb.reverse();
		System.out.println("Reverse String :"+rev);
	}

}
