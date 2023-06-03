import java.util.Scanner;

public class ExtremePrint {
	
	public static void extremePrint(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			if(start == end) {
				System.out.print(arr[start]+" ");
			}
			else {
				System.out.print(arr[start]+" "+arr[end]+" ");
			}
			start++;
			end--;
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
		extremePrint(arr);
		
		System.out.println();
		
		
		scan.close();
		
	}

}
