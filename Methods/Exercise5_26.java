/* Find the first 100 prime numbers that are reversed primes as well */

public class Exercise5_26 {
	public static void main(String[] args) {
		int count = 1;
		
		for(int i = 2; true ; i++) {
			if(isPrime(i) && isPrime(reverse(i))) {
				System.out.println(i);
				
				if(count == 100) {
					break;
				}
				
				count++;
			}
		}
	}
	
	public static boolean isPrime(int number) {
		if(number <= 1)	{
			return false;
		}
		if(number == 2)	{
			return true;
		}
		
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int reverse(int number) {
		int reversed = 0;
		
		while(number != 0) {
			int lastDigit = number % 10;
			reversed = reversed * 10 + lastDigit;
			number /= 10;
		}
		return reversed;
	}
 }