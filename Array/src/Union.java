
public class Union {
	
	public static void union(int arr1[],int arr2[]) {
		
		int size = arr1.length +arr2.length;
		
		int arr[] = new int[size];
		
		for(int i=0;i<arr1.length;i++) {
			arr[i] = arr1[i];
		}
		for(int j=0;j<arr.length;j++) {
			arr[j] = arr2[j];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[j] = Integer.MIN_VALUE;
				}
			}
		}
		System.out.println("Union of an array :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != Integer.MIN_VALUE) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
	}

	public static void main(String[] args) {

		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {3,4,5,6,7,8,9};
		
		union(arr1,arr2);
		
		
		
	}

}
