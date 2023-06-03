//Time Complexity O(n^2)
//Space Complexity O(1)

import java.util.Scanner;

public class DuplicateElement {
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Ente the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		//Duplicate number in an array:
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]== arr[j]) {
					System.out.println("The duplecate element is :"+ arr[i]);
				}
			}
		}
		scan.close();
	}

}
