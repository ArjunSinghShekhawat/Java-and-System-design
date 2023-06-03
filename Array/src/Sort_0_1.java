
public class Sort_0_1 {
	
	public static void sort(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			if(arr[start]==0) {
				start++;
			}
			else if(arr[end] == 1) {
				end--;
			}
			else if(arr[start] != 0) {
				if(arr[end]==0) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start++;
					end--;
				}
				else {
					end--;
				}
			}
			else if(arr[end] != 1) {
				if(arr[start] == 1) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start++;
					end--;
				}
				else {
					start++;
				}
			}
		}
		
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {

		int arr[] = {1,0,0,0,1,1,1,0,0,0,1,1,1,0,0};
		sort(arr);
		print(arr);
		
		
	}

}
