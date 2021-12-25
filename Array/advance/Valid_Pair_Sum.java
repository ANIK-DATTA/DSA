package array.advance;

import java.util.Arrays;

/*
 * Given an array of size N, find the number of distinct pairs {i, j} (i != j) in the array 
 * such that the sum of a[i] and a[j] is greater than 0.
Example 1:
	Input: N = 3, a[] = {3, -2, 1}
	Output: 2
	Explanation: {3, -2}, {3, 1} are two possible pairs.
Example 2:
	Input: N = 4, a[] = {-1, -1, -1, 0}
	Output: 0
	Explanation: There are no possible pairs.
 */
public class Valid_Pair_Sum {
	static int res(int arr[]){
		int ans=0;
		int st=0, end=arr.length-1;
		Arrays.sort(arr);	// -2 -1 1 3 4	
		seeArrayNow(arr); // void function just to check array after sorting
		while(st<end) {
			if(arr[st]+arr[end]>0) {
				ans += end-st;
				end--;
			}
			else	st++;		
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {4,1,-2,3,-1};
		System.out.println("Arr: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("\nTwo pointer approach: "+res(arr));
		
	}
	static void seeArrayNow(int arr[]) {
		System.out.println("Sorted: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
