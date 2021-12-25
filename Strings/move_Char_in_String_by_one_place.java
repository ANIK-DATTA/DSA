package Strings;

public class move_Char_in_String_by_one_place {
	
	static String move(String Str) {
		String res = " ";
		for(char cH : Str.toCharArray()) {
			res += Character.toString((char) (((cH-'a'+1)%26)+'a'));
		}
		return res;
	}
	
	public static void main(String[] args) {
		String Str = "abc";
		System.out.println("Str: "+Str);
		System.out.println("After moving by 1 place: "+move(Str));
	}

}
