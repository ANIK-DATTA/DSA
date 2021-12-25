package bits_Manipulation;

public class Count_Set_Bits {

	public static void main(String[] args) {
			int n = 6;
			
			//naive solutions
			int res1 = countSetBit1(n);
			System.out.println("Set Bits in "+n+" using method 1 = "+res1);
			int res2 = countSetBit2(n);
			System.out.println("Set Bits in "+n+" using method 2 = "+res2);
			int res2_2 = countSetBit2_2(n);
			System.out.println("Set Bits in "+n+" using method 2 more simplify = "+res2_2);
			
			//recursive
			int res1_1 = countSetBit1_1(n);
			System.out.println("Set Bits in "+n+" using recursion method 1 = "+res1_1);
//................................................................................................
			//Brian Kernighan’s Algorithm:
			int res3 = countSetBit3(n);
			System.out.println("Set Bits in "+n+" using Brian Kernighan's Algo = "+res3);
			// recursion
			int res3_2 = countSetBit3_2(n);
			System.out.println("Set Bits in "+n+" using Brian Kernighan's Algo in recursion = "+res3_2);
//........................................................................................................			
	
	}
	
	//naive solution
	static int countSetBit1(int n) {
		// method 1 without bits manipulation naive solution
		int result = 0;
		while(n != 0) {
			if(n%2 != 0)
				result++;
			n /= 2;
		}
		return result;
	}
	
	static int countSetBit2(int n) {
		// method 2 with bits manipulation naive soltution
		int result = 0;
		while(n != 0) {
			if((n&1) == 1)
				result++;
			n = n>>1;
		}
		return result;
	}
	
	static int countSetBit2_2(int n) {
		//method  2 more simplify
		int result = 0;
		while(n > 0) {
			result += (n&1);
			n = n>>1;
		}
		return result;
	}
	
	//using recursion method
	static int countSetBit1_1(int n) {
		//using recursion
		if (n == 0) 
			return 0;
		return (n&1) + countSetBit1_1(n>>1);
	}
	//.......................................................................
	//Brian Kernighan’s Algorithm:
	static int countSetBit3(int n) {
		int count = 0;
		while(n!=0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
	//recursion Brian Kernighan's Algorithm
	static int countSetBit3_2(int n) {
		if (n == 0)
			return 0;
		return 1 + countSetBit3_2(n&(n-1));
	}
	
}
