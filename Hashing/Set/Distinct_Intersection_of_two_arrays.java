package Hashing.Set;
import java.util.*;
public class Distinct_Intersection_of_two_arrays {
	static void eff(int a[], int b[]) {
		HashSet<Integer> set =new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if(set.contains(b[i])) {
				count++;
				set.remove(b[i]);
			}
		}
		System.out.println("Eff: "+count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,4,2,2};
		int b[] = {2,3,2,8,1,1};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(); naive(a, b);
		System.out.println(); eff(a,b);
		
	}
	
	
	static void naive(int a[], int b[]) {

		int count=0;
		for(int i=0;i<a.length;i++) { // checking distinct element in array 1
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(a[i] == a[j]) {
					flag = true;
					break;
				}	
			}
			if(flag == true)	continue; // continue on repeating element
			
			for(int j=0;j<b.length;j++) { // matching element with distinct element of array 1
				if(a[i] == b[j]) {
					count++;
					break;             // breaking to not matching more than 1 time
				}
			}
		}
		System.out.println("Naive Count: "+count);
	}
}
