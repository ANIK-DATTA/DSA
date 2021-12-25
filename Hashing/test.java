package Hashing;
import java.util.*;
public class test {
	static void eff(int arr[]) {
		int res=0;
		HashSet<Integer> set = new HashSet<>();
		//making hashtable
		for(int i=0;i<arr.length;i++)
			set.add(arr[i]);
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i]-1) == false) {
				int count=1;
				while(set.contains(arr[i]+count))
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
		
		eff(arr);
	}

}
