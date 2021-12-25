package Sorting.Merge_Sort;

import Sorting.test;

public class Merge_Sort {
	static void merge(int arr[], int l, int m, int h) {
		int n1=m-l+1, n2=h-m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for(int i=0;i<n1;i++) 
			left[i] = arr[i+l];
		
		for(int j=0;j<n2;j++) 
			right[j] = arr[m+1+j];
		
		int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
		while(i<n1)
			arr[k++] = left[i++];
		while(j<n2)
			arr[k++] = right[j++];
	}
	
	static void mergeSort(int arr[], int l, int h) {
		if(h>l) {
			int m=l+(h-l)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,h);
			merge(arr,l,m,h);
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {2,4,2,21,3,1,5};
		int l=0,h=6;
		System.out.println("Array: ");
		test.print(arr);
		mergeSort(arr,l,h);
		System.out.println("After: ");
		test.print(arr);
	}
	
   
}
