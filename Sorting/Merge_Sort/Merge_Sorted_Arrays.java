package Sorting.Merge_Sort;

import java.util.Arrays;

import Sorting.test;

public class Merge_Sorted_Arrays {
	static void merge(int a[], int b[]) {
		int i=0,j=0,k=0;
		int c[] = new int[a.length+b.length];
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k] = b[j];
				j++;
			}
			else	{
				c[k] = a[i];
				i++;
			}
			k++;
		}
		while(i<a.length) {
			c[k] = a[i];	k++; i++;	
		}
		while(i<b.length) {	c[k] = b[j];
		k++; j++;
		}
		test.print(c);
	}
	public static void main(String[] args) {
		int a[] = {10,15,20};
		int b[] = {2,5,18};
		System.out.print("Array 1: "); 	test.print(a);
		System.out.print("Array 2: ");	test.print(b);
		merge(a,b);
		naive(a,b);
	}
	static void naive(int a[], int b[]) {
		int c[] = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[a.length+j] = b[j];
		}
		Arrays.sort(c);
		System.out.print("Naive: ");
		test.print(c);
	}
}
