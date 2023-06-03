//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		boolean flag = true;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i] != arr[arr.length-i-1]) {
				
				flag = false;
				break;
				
			}
		}
		if(flag) {
			System.out.print("The array arr is palindrome :");
		}
		else {
			System.out.print("The array arr is not palindrome :");
		}
		
		scan.close();
		

	}

}
