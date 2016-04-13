/* Find the index of the smallest element in an array */

public class Exercise6_10 {
	public static void main(String[] args) {
		int[] num = {0, 3, 5, 3, -3};
		
		System.out.println("The min index of the array is " + minIndex(num));
	}
	
	public static int minIndex(int[] num) {
		int min = num[0];
		int minIndex = 0;
		
		for(int i = 1; i < num.length; i++) {
			if(min > num[i]) {
				min = num[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}