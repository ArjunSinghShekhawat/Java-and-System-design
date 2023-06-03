import java.util.Scanner;

public class SqureRoot {
	
	public static int squreRoot(int num) {
		int start = 0;
		int end = num;
		int mid = start + (end-start)/2;
		int result = 0;
		
		while(start<= end) {
			mid = start + (end-start)/2;
			
			int val = mid * mid;
			
			if(val == num) {
				return mid;
			}
			else if(val > num) {
				end = mid-1;
			}
			else {
				result = mid;
				start = mid+1;
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number for required find out squre root :");
		int number = scan.nextInt();
		
		int result = squreRoot(number);
		
		if(result != 0) {
			System.out.println("Your "+number+" squre root will be :"+result);
		}
		else {
			System.out.println("Your number is invalid :");
		}

		
	}

}
