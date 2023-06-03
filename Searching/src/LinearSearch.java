//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class LinearSearch {
	
	public static void input(int arr[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
	}
	public static int linearSearch(int arr[],int element) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		input(arr);
		
		System.out.println("Enter the searching element :");
		int element = scan.nextInt();
		
		int result = linearSearch(arr,element);
		
		if(result != -1) {
			System.out.println("Your searching element present in an array at index :"+result);
		}
		else {
			System.out.println("Your searching element is not present in an array :");
		}
	}

}
