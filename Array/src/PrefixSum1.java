//Time Complexity O(m*n)
//Space Complexity O(1)

import java.util.Scanner;

public class PrefixSum1 {

	public static void main(String[] args) {
	
		//Simple approach 1
		
		int arr[][] = {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
		};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of r1 :");
		int r1 = scan.nextInt();
		
		System.out.println("Enter the value of c1 :");
		int c1 = scan.nextInt();
		
		System.out.println("Enter the value of r2 :");
		int r2 = scan.nextInt();
		
		System.out.println("Enter the value of c2 :");
		int c2 = scan.nextInt();
		
		int sum = 0;
		
		//prefix sum
		for(int i=r1;i<=r2;i++) {
			for(int j=c1;j<=c2;j++) {
				sum+=arr[i][j];
			}
		}
		
		System.out.println("The sum will be :"+sum);
		scan.close();
		
		
	}

}
