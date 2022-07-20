package programs;

public class CheckHex {

	public static void main(String[] args) {
		checkHex("B2F9C");
	}
	
	public static void checkHex(String s) {
		int n=s.length();
		for (int i = 0; i < n; i++) {
			char ch=s.charAt(i);
			if (ch<'0' || ch >'9' && ch<'A' || ch >'F') {
				System.out.println("No");
			//	return;
			}
		}
		System.out.println("Yes");
	}

}
