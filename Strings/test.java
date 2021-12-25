package Strings;

public class test {
	static String res(String str) {
		String res="";
		for(char c: str.toCharArray()) {
			res+= Character.toString((char) (((c-'a'+1)%26)+'a'));
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str = "Hello"; 
		System.out.println(str);
		System.out.println("After: "+res(str));
		
	}

}
