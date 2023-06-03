//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class PrintEvenElement {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size  = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		//For Each Element 
		for(int num:arr) {
			if(num%2 == 0) {
				System.out.print(num+ " ");
			}
		}
		System.out.println();
		scan.close();

	}

}
