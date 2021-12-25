package Sorting.Quick_Sort;
import Sorting.test;
// 	STABLE ALGO
public class Naive_partition {
	static void partition(int arr[], int l, int h, int p) {
		int temp[] = new int[h-l+1]; 
		int k=0;
		for(int i=l;i<=h;i++) {
			if(arr[i]<arr[p])
				temp[k++] = arr[i];
		}
		for(int i=l;i<=h;i++) {
			if(arr[i] == arr[p])
				temp[k++] = arr[i];
		}
		int res = l + k-1;
		
		for(int i=l;i<=h;i++) {
			if(arr[i]>arr[p])
				temp[k++] = arr[i];
		}
		for(int i=l;i<=h;i++) {
			arr[i] = temp[i-l];
		}
		System.out.println("res: "+res);
	}
	
	public static void main(String [] args) {
		int arr[] = {5,3,12,8,5};
		System.out.println("Array: ");
		test.print(arr);
		int l=0,h=arr.length-1,p=4;
		partition(arr,l,h,p);
		test.print(arr);
	}
}
