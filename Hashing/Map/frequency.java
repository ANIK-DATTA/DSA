package Hashing.Map;

import java.util.HashMap;
import java.util.Map;

public class frequency {
	static void eff2(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {	//making hashMap
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
//		// Iteration
//		for(Map.Entry<Integer, Integer> itr: map.entrySet()) {
//			System.out.print(itr.getKey()+": "+itr.getValue()+", ");
//		}
	}
	static void eff(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]) == false) // if key appears 1st time frequency = 1
				map.put(arr[i], 1);
			else  // if keys appears more than one times
				map.put(arr[i], map.get(arr[i])+1);
		}
		// print
		for(Map.Entry<Integer, Integer> itr: map.entrySet())
			System.out.println(itr.getKey()+": "+itr.getValue());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,2,1,1,3,5,2};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEff2: ");eff2(arr);
		System.out.println("\nEff:");eff(arr);
		System.out.println("\nNaive: ");n(arr);
		
	}
	
	
	
	
	
	
	static void n(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean flag= false;
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {	// if element appears second time
					flag = true; break;
				}
			}
			
			if(flag == true)	continue;	// already counted frequency continue	outer loop
			int freq = 1;                  // code will continue from here only if element appears first time
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])
					freq++;
			}
			System.out.println(arr[i]+": "+freq);
		}
	}
}
