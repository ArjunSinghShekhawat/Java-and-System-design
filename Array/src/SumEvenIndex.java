//Time Complexity
// Space Complexity


import java.util.Scanner;

public class SumEvenIndex {
	
	public static int evenIndexSum(int arr[]) {
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int result = evenIndexSum(arr);
		
		System.out.println("The sum of all even index :"+ result);
		
		scan.close();
		
		
	}

}
