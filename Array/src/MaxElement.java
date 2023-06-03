//Time Complexity O(n)
//Space Complexity (1)

import java.util.Scanner;

public class MaxElement {
	
	public static int maxElement(int arr[]) {
		
		int maxi = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxi) {
				maxi = arr[i];
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Eter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int maximumElement = maxElement(arr);
		
		System.out.println("The maximum element in an array :"+ maximumElement);
		
		scan.close();
		

	}

}
