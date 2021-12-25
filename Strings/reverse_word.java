package Strings;

public class reverse_word {
	static void reverse(char [] str, int st, int end) {
		while(st<=end) {
			char temp = str[st];
			str[st] = str[end];
			str[end] = temp;
			st++; end--;
		}
	}
	static void revString(char [] str) {
		int st = 0;
		int n =str.length;
		for(int end=0;end<n;end++) {
			if(str[end] == ' ') {
				reverse(str, st, end-1);
				st = end+1;
			}
		}
		reverse(str, st, n-1); //rotate last word after space
		reverse(str, 0, n-1);	//rotate all chars of String
	}
	public static void main(String args[]) {
		String s = "Hi this is Anik";
		char [] str = s.toCharArray();
		System.out.println(str);
		revString(str);
		System.out.println(str);
	}

}
