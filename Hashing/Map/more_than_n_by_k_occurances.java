package Hashing.Map;
import java.util.*;
public class more_than_n_by_k_occurances {
	//print element whose count of occurrence  more than n/k times where n = size and k = key
	
	//O(nK) solution for more elements
	static void nk_eff(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {		//Updating of frequency
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			else if(map.size()<k-1)		//new insertion if array not full
				map.put(arr[i], 1);
			else						// decrement freq if new element found and
				for(Map.Entry<Integer, Integer> itr: map.entrySet()) {	//array is full
					map.put(itr.getKey(), itr.getValue()-1);
					if(itr.getKey() == 0)	//deletion if freq become = 0
						map.remove(itr.getKey());
					}
		}
		for(Map.Entry<Integer, Integer> itr: map.entrySet()) {
			if(itr.getValue()>k)
				System.out.println(itr.getKey()+" "+itr.getValue());
		}
	}
	
	static void eff(int arr[],int k) {		// n 
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> itr: map.entrySet()) {
			if(itr.getValue()>k)
				System.out.println(itr.getKey()+" "+itr.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {30,10,20,20,30,20,30,30,30};
		int key = 2;
		int k = arr.length/key;
		System.out.println("Key: "+k);
		for(int itr:arr)
			System.out.print(itr+" ");
		System.out.println("\n Nk method Eff: ");	nk_eff(arr,k);
		System.out.println("Eff: ");	eff(arr,k);
		System.out.println("Naive: ");	naive(arr,k);
	}
	static void naive(int arr[], int k) {	// nlogn + n = nlogn
	Arrays.sort(arr); // nlogn
	int  count=1;
	for(int i=1;i<arr.length;i++) {				// n times bcoz inner loop also using same increment condition
		while(i<arr.length && arr[i] == arr[i-1]) {
			i++;	count++;
		}
		if(count>k)	System.out.println(arr[i-1]+": "+count);
		count=1;	
	}
	}

}
