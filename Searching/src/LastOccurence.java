import java.util.Scanner;

public class LastOccurence {
	
	public static void input(int arr[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the array element :");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println();
	}
	public static int lastOccurence(int arr[],int element) {
	
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end-start)/2;
		int answer = 0;
		
		while(start <= end) {
			
			mid = start + (end - start)/2;
			
			if(arr[mid] == element) {
				answer = mid;
				start = mid+1;
			}
			else if(arr[mid]>element){
				end = mid-1;
				
			}
			else {
				start = mid+1;
				
			}
		}
		return answer;
	}
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();

		int arr[] = new int[size];

		input(arr);

		System.out.println("Enter the searching element :");
		int element = scan.nextInt();
		
		int result = lastOccurence(arr,element);
		
		if(result != 0) {
			System.out.println("Your enter number last occurence will be :"+ result);
		}
		else {
			System.out.println("Your searching element is not present in an array :");
		}
	}

}