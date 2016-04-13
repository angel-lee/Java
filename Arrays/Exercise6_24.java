/* Add two matrices */

public class Exercise6_24 {
	public static void main(String[] args) {
		int[][] m1 = {
			{1, 1, 1},
			{2, 2, 2},
			{3, 3, 3}
		};
		int[][] m2 = {
			{1, 1, 1},
			{2, 2, 2},
			{3, 3, 3}
		};
		
		int[][] result = new int[m1.length][m1[0].length];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}