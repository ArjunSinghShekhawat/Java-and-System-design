import java.util.Scanner;

public class Rotate2DArray {
	
	public static void print(int num[][]) {
		System.out.println("Print method :");
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void rotate(int arr[][]) {
		
		//Transport 
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
			print(arr);
		}
		//swap
		for(int i=0;i<arr.length;i++) {
			int li = 0;
			int ri = arr.length-1;
			
			while(li<ri) {
				int temp = arr[i][ri];
				arr[i][ri] = arr[i][li];
				arr[i][li] = temp;
				li++;
				ri--;
			}
		}
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("Print Before Rotate :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		rotate(arr);
		System.out.println("After 90 deg rotate :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
