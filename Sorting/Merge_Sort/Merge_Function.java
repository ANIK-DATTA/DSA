package Sorting.Merge_Sort;

import Sorting.test;

public class Merge_Function {
	static void mergeFn(int arr[], int l, int m, int h) {
		int a[] = new int[m+1];
		int b[] = new int[h-m];
		int i=0,j=0;
		while(i<m+1) {
			a[i] = arr[i];
			i++;
		}
		while(i<h+1) {
			b[j] = arr[i];
			i++;	j++;
		}
		i=0;j=0;
		System.out.println("Array1: ");test.print(a);
		System.out.println("Array2: ");test.print(b);
		System.out.println("Sorted: ");
		merge(a, b, arr);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,15,22};
		int l=0,m=2,h=4;
		System.out.println("Array: ");
		test.print(arr);
		mergeFn(arr,l,m,h);
		test.print(arr);
	}
	
	static int[] merge(int a[], int b[], int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) 
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i<a.length) {
			c[k++] = a[i++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		return c;
	}
	
	
	
	
}
