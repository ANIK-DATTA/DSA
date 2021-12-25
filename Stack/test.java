package Stack;
import java.util.*;

public class test {
	static void eff(int arr[]) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		ArrayList<Integer> a = new ArrayList<>();
		int n=arr.length;
		s.push(arr[n-1]); a.add(-1);
		for(int i=n-2;i>=0;i--) {
			while(s.isEmpty()==false && arr[i]>=s.peek())
				s.pop();
			int res = s.isEmpty()?-1:s.peek();
			s.push(arr[i]);
			a.add(res);
		}
		Collections.reverse(a);
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
	}
	public static void main(String args[]) {
		int a[] = {3,1,5,12,4,9};
		System.out.println("Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrev greatest: ");
		naive(a);System.out.println();
		eff(a);
	}
	static void naive(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 boolean flag=false;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[j]>arr[i]) {
					 flag=true;
					 System.out.print(arr[j]+" ");
					 break;
				 }
			 }
			 if(flag==false)
				 System.out.print(-1+" ");
		 }
	}
}
