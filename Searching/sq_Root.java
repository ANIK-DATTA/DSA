package searching;

public class sq_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ele = 18;
		System.out.println(eff(ele));
	}
	static int eff(int ele) {
		int l = 0, h = ele, ans=1;
		while(l<=h) {
			int mid = (l+h)/2;
			int sqrt = mid*mid;
			if(sqrt == ele)
				return mid;
			else if(sqrt > ele)	h = mid-1;
			else {
				l = mid+1;
				ans = mid;
			}
		}
		return ans;
	}
	
	static int	sqroot(int ele) {
		int x=1;
		while(x*x <= ele) {
			x++;
		}
		
		return x-1;
	}
}
