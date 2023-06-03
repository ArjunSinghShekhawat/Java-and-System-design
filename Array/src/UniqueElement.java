//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class UniqueElement {
	
	public static int uniqueElement(int arr[]) {
		int ans = 0;
		
		for(int i=0;i<arr.length;i++) {
			ans ^=arr[i];
		}
		return ans;
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
		
		int uniqueElement = uniqueElement(arr);
		
		System.out.println("The unique Element in an array will be :"+ uniqueElement);
		
		scan.close();
		

	}

}
