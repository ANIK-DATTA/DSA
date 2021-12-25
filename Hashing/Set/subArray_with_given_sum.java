package Hashing.Set;

import java.util.HashSet;

public class subArray_with_given_sum {
	static boolean eff(int arr[], int sum) {
		HashSet<Integer> set = new HashSet<>();
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];
			if(set.contains(res-sum))	return true;
			if(res == sum )	return true;
			set.add(res);
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,2,8,10,-5-8,6};
		int sum = 3;
		System.out.println("Eff: "+eff(arr, sum));
		System.out.println("SubArraay Naive: "+naive(arr, sum));
	}
	
	static boolean naive(int arr[], int sum) {
		for (int i = 0; i < arr.length; i++) {
			int res=arr[i]; if(res == sum)	return true;
			 for (int j = i+1; j < arr.length; j++) {
				res += arr[j];
				if(res == sum)	return true;
			} 
		}
		return false;
	}
}
