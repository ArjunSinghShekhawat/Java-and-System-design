
public class TripletSum {

	
	public static void tripletSum(int arr1[],int arr2[],int arr3[],int sum) {
		
		for(int i=0;i<arr1.length;i++) {
			int element1 = arr1[i];
			for(int j=i+1;j<arr2.length;j++) {
				int element2 = arr2[j];
				for(int k=j+1;k<arr3.length;k++) {
					int element3 = arr3[k];
					if(element1 + element2 + element3 == sum) {
						System.out.println("Pair is ("+element1+","+element2+","+element3+")"+" :");
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		int arr1[] = {2,3,4,5,6,7};
		int arr2[] = {4,5,6,7,8,9};
		int arr3[] = {2,3,5,8,6,9,8};
		
		int sum = 15;
		
		tripletSum(arr1,arr2,arr3,sum);
		
		
		
	}

}
