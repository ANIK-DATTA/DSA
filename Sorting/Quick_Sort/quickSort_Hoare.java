package Sorting.Quick_Sort;

import Sorting.test;

public class quickSort_Hoare {
	static void quickSort(int arr[], int l, int h) {
		if(l<h) {
			int p = Hoare_partition(arr,l,h);
			quickSort(arr,l,p);
			quickSort(arr,p+1,h);
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,5,12,8,5,1,8};
		System.out.println("Array: ");
		test.print(arr);
		int l=0,h=arr.length-1;
		quickSort(arr,l,h);
		System.out.println("Quick Sort using Hoare partition");
		test.print(arr);	

	}
	static int Hoare_partition(int arr[], int l, int h) {
		int pivot = arr[l];
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
}
