
public class PairSum {
	
	public static void pairSum(int arr[],int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(sum == arr[i]+arr[j]) {
					System.out.println("Pair ("+arr[i]+","+arr[j]+")"+":");				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int sum = 8;
		
		pairSum(arr,sum);
		

	}

}
