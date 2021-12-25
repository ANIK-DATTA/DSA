package bits_Manipulation;

public class PowOf2 {
	public static void main(String arg[]) {
		int n = 128;
		if(isPowOf2(n)) {
			// naive
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	
		//efficient
	if (efficient_isPowOf2(n)) 
		System.out.println("Yes efficient");
	else 
		System.out.println("no");
	}

	static boolean isPowOf2(int n) {
		//naive solution
		if(n == 0)
			return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n = n/2;
		}
		return true;
	}
	
	static boolean efficient_isPowOf2(int n) {
		return (n!=0) && ((n&(n-1)) == 0);
	}
	
}

