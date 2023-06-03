//Time Complexity O(n)
//Space Complexity O(1)

import java.util.Scanner;

public class Count_0_1 {
	public static int count_0(int arr[]) {
		
		int count_Zero = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count_Zero++;
			}
		}
		return count_Zero;
		
	}
	public static int count_1(int arr[]) {
		int count_One = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count_One++;
			}
		}
		return count_One;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the array element :");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count_Zero = count_0(arr);
		int count_One = count_1(arr);
		
		System.out.println("Count Zero in an Array will be :"+count_Zero);
		System.out.println("Count One in an Array will be  :"+count_One);
		
		scan.close();
		
	}

}
