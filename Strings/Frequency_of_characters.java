package Strings;

public class Frequency_of_characters {
	static void eff(String str) {
		int [] count = new int[26];
		str = str.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)-'a' < 0 || str.charAt(i)-'a' >= 26)	
				continue;
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(count[i] > 0) {
				System.out.println((char)(i+'a')+" "+count[i]);
			}
		}

	}
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str);
		System.out.println("Frequency:");	eff(str);
	}

}
