package Sorting;

public class Selection_Sort {
	static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {				// find min ele 
			int min = i;							// swap it with ith element 
			for(int j=i+1;j<arr.length;j++) {		
				if(arr[j]<arr[min])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		print(arr);
	}
	
	public static void main(String[] args) {	
		int arr[] = {5,3,1,7,9,2,4,1};
		System.out.println("Array: ");
		print(arr);
		System.out.println("Selection Sort: ");
		selectionSort(arr);
	}
	
	
	static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
