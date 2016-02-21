package recursion;

public class RecursionFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	public static int fibonacci(int n) {
		if ( n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	public static int factorial(int n) {
		if ( n == 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

}
