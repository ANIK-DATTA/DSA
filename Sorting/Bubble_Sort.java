package Sorting;
// Stable ALGO
public class Bubble_Sort {
	static void eff(int arr[]) {	//if no swapping happens in any loop then it breaks
		for(int i=0;i<arr.length;i++) {	
			boolean isSorted=true;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {	//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}
			}
			if(isSorted)	break;	//array is sorted thus no swapping happens
		}
		print(arr);
	}
	
	static void bubbleSort(int arr[]) {					// 2 1 4 7 3		
		for(int i=0;i<arr.length-1;i++) {				// 1 2 4 3 |7		last fixed
			for(int j=0;j<arr.length-i-1;j++) {			// 1 2 3 |4 7		last-i fixed
				if(arr[j]>arr[j+1]) {	//swap			// 1 2 |3 4 7		<= result
					int temp = arr[j];					
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		print(arr);
	}
	public static void main(String[] args) {
		int arr[] = {5,3,1,7,9,2,4,1};
		System.out.println("Array: ");
		print(arr);
		System.out.println("Bubble Sort: ");
		//bubbleSort(arr);
		eff(arr);
	}
	
	
	static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
