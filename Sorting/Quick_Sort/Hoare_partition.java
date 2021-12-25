package Sorting.Quick_Sort;
// NON	STABLE ALGO
import Sorting.test;

public class Hoare_partition {
	static int partition(int arr[], int l, int h){
		int pivot = arr[l];	//first element is pivot
		int i=l-1, j=h+1;
		while(true) {
			do {	i++;	}while(arr[i]<pivot);
			do {	j--;	}while(arr[j]>pivot);
			if(i>=j)	return j;
			swap(arr,i,j);
		}
	}
	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {3,5,12,8,5,1,8};
		System.out.println("Array: ");
		test.print(arr);
		int l=0,h=arr.length-1;
		int x = partition(arr,l,h);
		System.out.println(x);
		test.print(arr);	
	}
	
}
