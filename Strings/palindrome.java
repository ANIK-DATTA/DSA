package Strings;

public class palindrome {
	static boolean eff(String str) {
		int st = 0;
		int end = str.length()-1;
		while(st<end) {
			if(str.charAt(st) != str.charAt(end))
				return false;
			st++;
			end--;
		}
		return true;
	}
	static boolean isPalindrome(String str) {
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();
		return str.equals(rev.toString());
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		
		System.out.println("String is "+str);
		System.out.println("Eff : "+eff(str));
		
		System.out.println(isPalindrome(str));
		
	}

}
