package Strings;

public class String_is_subsequence_of_others {
	static boolean isSubstring(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int i=0,j=0;
		while(i<n && j<m) {
			if(str1.charAt(i) == str2.charAt(j))
				j++;
			i++;
		}
		return (j == m);
	}

	public static void main(String[] args) {
		String str1 = "ADADADA";
		String str2 = "AAD";
		System.out.println(str1+" "+str2);
		System.out.println("Substring: "+isSubstring(str1,str2));
	}

}
