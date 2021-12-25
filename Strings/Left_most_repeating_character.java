package Strings;

public class Left_most_repeating_character {
	static int eff(String str) {
		int res=-1;
		int [] count = new int[256];
		for(int i=str.length()-1;i>=0;i--) {
			if(count[str.charAt(i)]>0)
				res = i;
			else
				count[str.charAt(i)]++;
		}
		return res;
	}
	
	static int lmrc(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++)
				if(str.charAt(i) == str.charAt(j))	return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dcahbbscsq";
		System.out.println(str);
		System.out.println(lmrc(str));
		System.out.println("efficient: "+eff(str));
	}

}
