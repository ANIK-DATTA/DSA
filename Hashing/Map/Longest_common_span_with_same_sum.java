package Hashing.Map;

import java.util.HashMap;

public class Longest_common_span_with_same_sum {
	static void eff(int a[],int b[]) {
		int res = 0, sum=0;
		int temp[] = new int[a.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			temp[i] = a[i] - b[i]; //longest sumArray with sum=0 of temp array
			sum+=temp[i];
			if(sum == 0)	res=i+1; //res=1 at first itr bcoz i=0 & if no preSum case
			if(map.containsKey(sum) == false)
				map.put(sum, i);
			if(map.containsKey(sum))
				res = Math.max(res, i - map.get(sum));
		}
			
		System.out.println("Eff: "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,0,0,0,1}; 
		int b[] = {0,0,0,0,1,0}; 
		naive(a,b);	eff(a,b);
	}
	static void naive(int a[], int b[]) {
		int  res=0;
		for(int i=0;i<a.length;i++) {
			int sum1=0, sum2=0;
			for(int j=i;j<a.length;j++) {
				sum1 += a[j];
				sum2 += b[j];
				if(sum1 == sum2)
					res = Math.max(res, j-i+1);
			}
		}
		System.out.println("Naive: "+res);
	}
}
