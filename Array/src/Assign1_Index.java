import java.util.Scanner;

public class Assign1_Index {
	
	public static void assignValue1(int num[]) {
		for(int i=0;i<num.length;i++) {
			num[i] = 1;
		}
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
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
		System.out.println("Before Assign 1 value :");
		print(arr);
		System.out.println("After Assign 1 value :");
		assignValue1(arr);
		print(arr);
		
		scan.close();
		
		

	}

}
