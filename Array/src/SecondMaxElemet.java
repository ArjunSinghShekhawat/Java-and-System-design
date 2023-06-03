//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class SecondMaxElemet {
	
	public static int secondLargeElement(int arr[]) {
		
		int maxi1 = Integer.MIN_VALUE;
		int maxi2 = Integer.MIN_VALUE;
		int maxi3 = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxi1) {
				maxi3 = maxi2;
				maxi2 = maxi1;
				maxi1 = arr[i];
			}
			else if(arr[i]>maxi3 && arr[i]<maxi2) {
				maxi3 = arr[i];
			}
		}
		return maxi3;
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
		int secondMaxiElement = secondLargeElement(arr);
		
		System.out.println("The Second Large Element is :"+ secondMaxiElement);
		
		scan.close();

	}

}
