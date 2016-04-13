/* Bubble sort */

public class Exercise6_18 {
	public static void main(String[] args) {
		double[] list = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		System.out.println("Before bubble sort: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		bubbleSort(list);
		System.out.println("After bubble sort: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
	
	public static double[] bubbleSort(double[] list) {
		boolean changed = true;
		
		do {
			changed = false;
			for(int i = 0; i < list.length-1; i++) {
				if(list[i] > list[i+1]) {
					double temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					changed = true;
				}
			}
		} while(changed);
		
		return list;
	}
}