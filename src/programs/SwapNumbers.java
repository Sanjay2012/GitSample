package programs;

public class SwapNumbers {

	public static void main(String[] args) {
		
		SwapNumbers.sample(10, 20);

	}
	
	public static void sample(int a, int b) {
		System.out.println("The value of a before swap is :"+a);
		System.out.println("The value of b before swap is :"+b);
		
		b=a+b-(a=b);
		
		System.out.println("The value of a after swap is :"+a);
		System.out.println("The value of b after swap is :"+b);
		
		
	}

}
