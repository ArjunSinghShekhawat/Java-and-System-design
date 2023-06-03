//TC O(n^2)
//SC O(1)

public class InsertionSort {
	
	public static void insertion(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while( j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
	
		int arr[] = {8,3,5,1,2,8};
		
		insertion(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
