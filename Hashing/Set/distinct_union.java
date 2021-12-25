package Hashing.Set;

import java.util.*;

public class distinct_union {
	static int count(int a[], int b[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int i:a) {
			set.add(i);
		}
		for(int j: b) {
			set.add(j);
		}
		 
		return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,4};
		int b[] = {4,4,4,4,4,4,4};
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int j : b) {
			System.out.print(j+" ");
		}
		System.out.println("\nCount: "+count(a,b));
		System.out.println("Naive: "+naive(a,b));
		
	}
	static int naive(int a[], int b[]) {
		int c[] = new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i < a.length) {
				c[i] = a[i];
			}
			else	c[i] =b[i-a.length];
		}
		int count=0;
		for(int i=0;i<c.length;i++) {
			boolean flag = false;
			for(int j=0;j<i;j++) {
				if(c[i] == c[j]) {
					flag = true;	break;
				}
			}
			if(flag == false)	count++;
		}
		return count;
	}
}
