package Strings;

public class move_char_by_n_in_String {
	static String res(String str, int key) {
		String res = "";
		for(int i=0;i<str.length();i++) {
			res += Character.toString((char) (((str.charAt(i)-'a'+key)%26)+'a'));
		}
		return res;
	}
	public static void main(String args[]) {
		String str = "abcdefghijk";
		int key = 2;
		System.out.println("String: "+str+"\nTo move by: "+key+" characters");
		System.out.println("Result: "+res(str, key));
	}
}
