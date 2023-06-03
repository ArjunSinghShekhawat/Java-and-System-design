
public class SelectionSort {

	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;

			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			if (min_index != i) {
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int num[] = { 1, 3, 8, 6, 4, 9, 90 };
		
		selectionSort(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}

	}

}
