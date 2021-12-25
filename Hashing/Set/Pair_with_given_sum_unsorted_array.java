package Hashing.Set;

import java.util.HashSet;
import java.util.Set;

public class Pair_with_given_sum_unsorted_array {
	static boolean best(int arr[], int sum) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(sum-arr[i]))	return true; //checking complementing
			else
				set.add(arr[i]);
		}
		return false;
	}
	
	static boolean eff(int arr[], int sum) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == sum-arr[i])	continue; 
			if(set.contains(sum-arr[i]))	return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,8,-3,6};
		int sum = 3;
		System.out.println("Naive: "+naive(arr,sum));
		System.out.println("Efficient: "+eff(arr,sum));
		System.out.println("More Eff: "+best(arr,sum));
	}
	static boolean naive(int arr[], int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == sum)	return true;
			}
		}
		return false;
	}

}
