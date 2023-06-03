//Time Complexity O(n)
// Space Complexity O(1)
import java.util.Scanner;

public class MissingNumberArrayContinuesNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		//massing number 
		int naturalNumSum = 0;
		int sum = 0;
		
		naturalNumSum = ((size+1)*(size+2))/2;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int massingNum = 0;
		massingNum = naturalNumSum - sum;
		
		System.out.println("The Massing Number in an array :" + massingNum);
		
		scan.close();

	}

}
