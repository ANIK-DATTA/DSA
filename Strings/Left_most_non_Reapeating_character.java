package Strings;

import java.util.Arrays;

public class Left_most_non_Reapeating_character {
	static int best_eff(String str) {
		 int [] count = new int[256];
		 Arrays.fill(count, -1);
		 for(int i=0;i<str.length(); i++) {
			 if(count[str.charAt(i)] == -1)	
				 count[str.charAt(i)] = i;
			 else
				 count[str.charAt(i)] = -2;
		 }
		 int res = Integer.MAX_VALUE;
		 for(int i=0;i<256;i++) {
			 if(count[i] >= 0)
				 res = Math.min(res, count[i]);
		 }
		 if(res == Integer.MAX_VALUE)	return -1;
		 return res;
	}
	
	static int eff(String str) {
		int [] count = new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++)
			if(count[str.charAt(i)] == 1)	
				return i;
		return -1;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dae";
		System.out.println(str);
		System.out.println("best: "+best_eff(str));
		System.out.println("eff: "+eff(str));
		System.out.println("naive: "+naive(str));
	}

	static int naive(String str) {
		for(int i=0;i<str.length();i++) {
			boolean flag = false;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j) && i != j)	{
					flag = true;
					break;
				}	
				}
			if(flag == false)	
				return i;		
		}
		return -1;
	}
}
