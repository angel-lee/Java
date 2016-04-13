/* Find all of the perfect numbers that are less than 10000 */

public class Exercise4_32 {
	public static void main(String[] args) {
		for(int i = 6; i <= 10000; i++) {
			int sum = 0;
			int divisor = i - 1;
			
			while(divisor >= 1) {
				if(i % divisor == 0) {
					sum += divisor;
				}
				divisor--;
			}
			if(i == sum) {
				System.out.println(i);
			}
		}
	}
}