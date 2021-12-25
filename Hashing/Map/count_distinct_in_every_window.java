package Hashing.Map;

import java.util.*;

public class count_distinct_in_every_window {
	static void eff(int arr[], int k) { // n
		HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < k; i++) { 
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1); 
        } 
        System.out.print(m.size()+" "); 
        for (int i = k; i < arr.length; i++) {     
            m.put(arr[i - k],  m.get(arr[i - k]) - 1);
			// decreasing freq of last window element
            if (m.get(arr[i - k]) == 0) { 
                m.remove(arr[i-k]); 
            }   
			// remove ele if freq = 0
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            
			//adding next window last element
            System.out.print(m.size()+" "); 
        } 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,20,10,30,40,10};
		int k=4;
		System.out.println("Key: "+k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.print("\nNaive: ");
		naive(arr, k);
		System.out.print("\nbetter: ");
		better(arr,k);
		System.out.print("\nBest: ");	eff(arr,k);
	}
	
	static void better(int arr[], int win) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length-win+1;i++) { //n2
			for(int j=i;j<i+win;j++) {
					set.add(arr[j]);
			}
			System.out.print(set.size()+" ");
			set.clear();
			
		}
	}
	
	static void naive(int arr[], int wind) { //n3
		for(int i=0;i<arr.length-wind+1;i++) {	//array loop
			int count=0;
			for(int j=i;j<i+wind;j++) {	//window loop
				boolean flag = false;
				for(int k=i;k<j;k++) {	//check distinct
					if(arr[k] == arr[j])	{
						flag = true;	break;
					}
				}
				if(flag == false) count++;
			}
			System.out.print(count+" ");
		}
		
	}
}
