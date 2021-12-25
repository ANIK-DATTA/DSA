package Stack;
import java.util.*;
public class previous_greater_Element {
	static void eff(int arr[]) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		s.push(0);
		System.out.println(arr[0]+": "+-1);
		for(int i=1;i<arr.length;i++) {
			while(s.isEmpty()==false &&  arr[s.peek()]<=arr[i])
				s.pop();
			if(s.isEmpty())
				System.out.println(arr[i]+": "+-1);
			else
				System.out.println(arr[i]+": "+arr[s.peek()]);
			s.push(i);
		}
	}
	static void printNaive(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int j;
			for(j=i-1;j>=0;j--) {
				if(arr[j]>arr[i]) {
					System.out.print(arr[j]+" ");
						break;
				}	
			}
			if(j==-1)
				System.out.print(-1+" ");
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
