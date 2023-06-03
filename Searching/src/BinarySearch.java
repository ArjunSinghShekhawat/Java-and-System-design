import java.util.Scanner;

public class BinarySearch {
	public static void input(int arr[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the array element :");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
	}
	public static boolean binarySearch(int arr[],int element) {
		
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end - start)/2;
		
		while(start <= end) {
			mid = start + (end-start)/2;
			
			if(arr[mid]==element) {
				return true;
				
			}
			else if(arr[mid]>element) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();

		int arr[] = new int[size];

		input(arr);

		System.out.println("Enter the searching element :");
		int element = scan.nextInt();
		
		boolean result = binarySearch(arr,element);
		
		if(result) {
			System.out.println("Searching element is present in an array :");
		}
		else {
			System.out.println("Searching element is not present in an array :");
		}
	}

}
