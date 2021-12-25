package Hashing.Map;
import java.util.*;
public class Longest_subArray_equal_with_0_and_1 {
	static void eff(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum=0, res=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0)	arr[i] = -1;
			sum += arr[i];	
			if(sum == 0)	res=i+1;
			if(map.containsKey(sum) == false)
				map.put(sum,i);			
			if(map.containsKey(sum)) 
				res = Math.max(res, i-map.get(sum));	
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEff: "+res+" "+map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,1,1,1,0,0}; // {1,1,-1,-1,1,-1,-1}
		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		naive(arr);	eff(arr);
	}
	static void naive(int arr[]) {
		int  res=0;
		for(int i=0;i<arr.length;i++) {
			int c0=0, c1=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j] == 0)	c0++;
				else	c1++;
				if(c0 == c1)	
					res = Math.max(res, c1+c0);
			} 
		}
		System.out.println("Naive: "+res);
	}

}
