package recursion;

public class Primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
		public static boolean isPrime(long n) {
			if (n == 1) {
				return false;
			}
			if ( n == 2) {
				return true;
			}
			if ( n % 2 == 0) {
				return false;
			}
		    long maxFactor = (long) Math.sqrt(n);
			for (int factor = 3; factor <= maxFactor ; factor +=2) {
				if (n % factor == 0) {
					return false;
				}
			}
			return true;
		}
		public static long largestPrime(long n) {
			while(! isPrime(n)) 
				n = n-1;
			return n;
			
			
			}
		public static boolean isTwinPrime(long n) {
			return isPrime(n) && (isPrime(n-2) || isPrime(n+2));
		}
		public static double twinPrimesRatio (long n) {
			double twinPrimes = 0;
			int primes = 0;
			for (long i = 2; i<= n; i++) {
				if (isPrime(i)) {
					primes++;
					if(isTwinPrime(i)) {
						twinPrimes++;
						
					}
				}
			}
		}
	}

	


