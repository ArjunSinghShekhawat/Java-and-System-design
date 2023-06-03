//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class LinearSearch {
	
	public static void inputArray(int arr[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
		
		
		
	}
	public static boolean linearSearch(int arr[],int element) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return true;
			}
		}
		return false;
		
	}
	public static void printArray(int arr[]) {
		
		System.out.println("Print the array element :");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		
		inputArray(arr);
		
		System.out.println("Enter the searching element :");
		int element = scan.nextInt();
		
		boolean result = linearSearch(arr,element);
		
		if(result) {
			System.out.println("Searching Element present in an array :");
		}
		else {
			System.out.println("Searching element is not present in an array :");
		}
		scan.close();
		
	}

}
