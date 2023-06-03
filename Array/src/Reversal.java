//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Before Reverse of an Array :");
		
		//Before Reverse
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// Reverse Operation 
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		System.out.println("After Reverse of an array :");
		
		//After reverse
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		scan.close();

	}

}
