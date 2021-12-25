package Hashing.Set;
import java.util.*;
public class count_distinct_element {
	static int eff(int arr[]) {
		 HashSet <Integer> set = new HashSet<>();
		 for(int i=0;i<arr.length;i++) {
			 set.add(arr[i]);
		 }
			 
		 return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,2,3,2};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nDistinct element: ");
		System.out.println("Eff: "+eff(arr));
		System.out.println("Naive: "+count(arr));
		System.out.println("Naive 2: "+count_n(arr));
	}
	
	static int count(int arr[]) {
		int count=1;
		if(arr.length == 0)	return 0;
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1] == arr[i])	continue;
			count++;
		}
		return count;
	}
	
	
	
	static int count_n(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			boolean flag=false;
			for(int j=0;j<i;j++){
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==false)	count++;
		}
		return count;
	}

}
