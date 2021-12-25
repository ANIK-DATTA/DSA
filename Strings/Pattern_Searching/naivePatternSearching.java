package Strings.Pattern_Searching;

public class naivePatternSearching {
	static void eff(String str, String pt) {
		int n=str.length();
		int m=pt.length();
		int j=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == pt.charAt(j)) {
				j++;
				if(j == m)	{
					System.out.println(i-j+1);
					j=0;
				}
			}
			else {	
				i = i-j;				
				j=0;
			}
		}
	}
	public static void main(String[] args) {
		String str = "ababa";
		String pt = "ab";
		System.out.println(str+"   "+pt);
		search(str,pt);
		System.out.println("\neff");
		eff(str,pt);
	}
	
	static void search(String str, String pt) {
		int n = str.length();
		int m = pt.length();
		for(int i=0;i<=n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if( pt.charAt(j) != str.charAt(i+j))	break;
			}
			if(j == m)
				System.out.println(i+" ");
		}
		  
	}
	

}
