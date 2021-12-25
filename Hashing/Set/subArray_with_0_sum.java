package Hashing.Set;
import java.util.*;
public class subArray_with_0_sum {
	static boolean eff(int arr[], int sum) {
		HashSet<Integer> set = new HashSet<>();
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
			if(set.contains(res))	return true;
			if(res == 0)	return true;
			set.add(res);				
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,2,8,10,-2,-8,6};
		int sum = 0;
		for(int i:arr)	
			System.out.print(i+" ");
		System.out.println("\nsum: "+sum);
		
		System.out.println("Eff: "+eff(arr, sum));
		System.out.println("SubArraay Naive: "+naive(arr, sum));
	}
	static boolean naive(int arr[], int sum) {
		for (int i = 0; i < arr.length; i++) {
			int res=arr[i];
			 for (int j = i+1; j < arr.length; j++) {
				res += arr[j];
				if(res == sum)	return true;
			}
		}
		return false;
	}
}
