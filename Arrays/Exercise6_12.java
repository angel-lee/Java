/* Reverse an array without using a second array */

public class Exercise6_12 {
	public static void main(String[] args) {
		int[] num = {0, 1, 2, 3, 4, 5};
		reverse(num);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	public static int[] reverse(int[] num) {
		for(int i = 0, j = num.length-1; i < num.length/2; i++, j--) {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
		return num;
	}
}