package Sorting.Quick_Sort;

import Sorting.test;

public class quickSort_Lomuto {
	static void quickSort(int arr[], int l, int h) {
		if(l<h) {
			int p = lomuto_partition(arr,l,h);
			quickSort(arr,l,p-1);
			quickSort(arr,p+1,h);
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,3,12,8,5,1,8};
		System.out.println("Array: ");
		test.print(arr);
		int l=0,h=arr.length-1;
		quickSort(arr,l,h);
		System.out.println("Quick Sort using Lomuto partition");
		test.print(arr);
	}
	static int lomuto_partition(int arr[], int l, int h) {
		int pivot = arr[h];	// last element is pivot
		int i=-1;
		for(int j=0;j<h;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,++i,h);
		return i;
	}
	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
