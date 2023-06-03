
public class Insertion {
	
	public static void insertion(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			int element = arr1[i];
			for(int j=0;j<arr2.length;j++) {
				if(element == arr2[j]) {
					System.out.print(arr2[j]+" ");
					arr2[j] = -1;
					
				}
			}
		}	
	}

	public static void main(String[] args) {
		
		int arr1[] = {3,4,5,6,3};
		int arr2[] = {5,6,7,8,3};
		
		insertion(arr1,arr2);	

	}

}
