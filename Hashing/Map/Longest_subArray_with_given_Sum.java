package Hashing.Map;
import java.util.*;
public class Longest_subArray_with_given_Sum {
	static void eff(int arr[], int sum) {
		Map<Integer, Integer> map= new HashMap<>();
		 int psum = 0, res = 0;
		 for(int i=0;i<arr.length;i++) {
			 psum += arr[i];
			 if(psum == sum)	 // for arr = {15,2,5} and key = 17 
				 res = i+1;    // set = {15 , 17, 22} preSum 17-17=0 not present by this algo
	//if same Presum is found we update res here	 	//so we have to check it by comparing
			 if(map.containsKey(psum) == false) //map only allow unique value
				 map.put(psum, i);	// so to have max sum we dont allow to add&modify the index value 
			 						//for same preSUm 
			 if(map.containsKey(psum-sum))	
				 res  = Math.max(res, i-map.get(psum-sum));
		 }
		 System.out.println(map);
		System.out.println("Sum: "+res);
		 
	}
	public static void main(String[] args) {
		int  arr[] = {5,8,-4,-4,1,7,2,-2}, sum=0;
		System.out.println("arr:");	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSum: "+sum);
		System.out.println("Eff: ");	eff(arr, sum);
		System.out.println("Longest subArray: "+count(arr, sum));
	}
	static int count2(int arr[], int sum) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			int curr_sum = 0;
			for(int j=i;j<arr.length;j++) {
				curr_sum += arr[j];
				if(curr_sum == sum)
					res = Math.max(res, j-i+1);
			}
		}
		return res;
	}
	static int count(int arr[], int sum) {
		int count =0, res=0, max=0;
		for(int i=0;i<arr.length;i++) {
			res = arr[i];	
			if(res == sum)	max = 1;
			for(int j=i+1;j<arr.length;j++) {
				res += arr[j];
				if(res == sum) {
					count = j-i+1;	System.out.println(count);
					max = Math.max(count, max);
					
				}
			}
		}
		return max;
	}
}
