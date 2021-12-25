package Hashing.Set;

import java.util.*;

public class Longest_Consecutive_Subsequence {
	static void eff(int arr[]) {  //linear = 3n = n
		HashSet<Integer> set = new HashSet<>();
		for(int ele:arr) //making hash table    // n time
			set.add(ele);
		
		int count=0, res=0;
		for (int i = 0; i < arr.length; i++) {  // 2*n, 2 lookup 
			if(set.contains(arr[i]-1) == false) { //check if1st element
				count=1;
				while(set.contains(arr[i]+count)) //check consecutive subArray or not
					count++;
					res = Math.max(res, count); 
			}	
		}
		System.out.println("Eff: "+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,10,1,2,4,51}; // 1,2,3,4,5 res = 5
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		naive1(arr);
		eff(arr);
	}
	static void naive1(int arr[]) { //nlogn
		Arrays.sort(arr);
		int count=1, res=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == (arr[i+1]-1))	
				count++;
			else if(arr[i] != (arr[i+1]))	{ //ignoring same consecutive element if any like 3,3 
				res = Math.max(res, count); //+1 to include last ele also
				count=1;
			}
		}
		System.out.println("\nNaive Sort method: "+res);
	}
}
