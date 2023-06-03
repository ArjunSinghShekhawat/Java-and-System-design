//TC O(n^2)
//SC O(1)
import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		
		System.out.println("Start bubble sort :");
		
		
		for(int i=0;i<arr.length;i++) {
			
			boolean flag = false;
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
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
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
