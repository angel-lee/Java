/* Find the pairs of twin primes that are less than 1000 */

public class Exercise5_30 {
	public static void main(String[] args) {
		int num = 2;
		
		for(int i = 2; i <= 1000; i++) {
			if(isPrime(i)) {
				if(i - num == 2) {
					System.out.println("(" + num + ", " + i + ")");
				}
				num = i;
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if(num <= 1) {	
			return false;
		}
		if(num == 2) {	
			return true;
		}
		
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {	
				return false;
			}
		}
		return true;
	}
}