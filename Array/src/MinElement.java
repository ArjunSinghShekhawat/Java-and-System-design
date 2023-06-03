//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class MinElement {

	public static int minElement(int arr[]) {
		
		int mini = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(mini>arr[i]) {
				mini = arr[i];
			}
		}
		return mini;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int minimumElement = minElement(arr);
		
		System.out.println("The minimum element in an array :"+ minimumElement);
		scan.close();

	}

}
