package Sorting.Quick_Sort;
import Sorting.test;
//	NON STABLE ALGO
public class Lomuto_Partition {
	static void partition(int arr[], int l, int h, int p) {
		swap(arr,p,h);	//last element is pivot
		int i=-1;
		for(int j=0;j<h;j++) {
			if(arr[j]<arr[p]) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,++i,h);
		System.out.println(i+": "+arr[i]);
		//return i;
	}
	
	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {5,3,12,8,5,1,8};
		System.out.println("Array: ");
		test.print(arr);
		int l=0,h=arr.length-1,p=4;
		partition(arr,l,h,p);
		test.print(arr);
		
	}

}
