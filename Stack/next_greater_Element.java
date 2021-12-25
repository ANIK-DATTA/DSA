package Stack;
import java.util.*;
public class next_greater_Element {
	static void eff(int arr[]) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		s.push(arr[arr.length-1]);
		System.out.println(arr[arr.length-1]+": "+-1);
		for(int i=arr.length-2;i>=0;i--) {
			while(s.isEmpty()==false && s.peek()<=arr[i]) {
				s.pop();
			}
			int res = s.isEmpty()?-1:s.peek();
			System.out.println(arr[i]+": "+res);
			s.push(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,12,5,20,14};
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		eff(arr);
	}

}
