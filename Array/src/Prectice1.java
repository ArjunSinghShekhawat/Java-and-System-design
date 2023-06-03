
import java.util.Scanner;

public class Prectice1 {
	
	public static void multiplyBy2(int arr[]){
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(2*arr[i]+" ");
		}
		System.out.println();
		
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
		multiplyBy2(arr);
		
		scan.close();
		

	}

}
