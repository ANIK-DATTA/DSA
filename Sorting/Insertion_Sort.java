package Sorting;

public class Insertion_Sort {
	static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(arr[j]>arr[i]) {
					arr[j+1] = arr[j];
				}
			}
			arr[j+1] = key;
		}
		print(arr);
	}
	public static void main(String[] args) {
		int arr[] = {5,3,1,7,9,2,4,1};
		System.out.println("Array: ");
		print(arr);
		System.out.println("Insertion Sort: ");
		insertionSort(arr);
	}
	
	
	static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	} 

}
