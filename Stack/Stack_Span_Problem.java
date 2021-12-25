package Stack;
import java.util.*;
public class Stack_Span_Problem {
	static void eff(int arr[]){
		ArrayDeque<Integer> s = new ArrayDeque<>();
		s.push(1);
		System.out.print(1+" ");
		for(int i=1;i<arr.length;i++) {
			while(s.isEmpty()==false && arr[s.peek()]<=arr[i]) {
				s.pop();
			}
			int res = s.isEmpty()?i+1:i-s.peek();
			System.out.print(res+" ");
			s.push(i);
		}
	}
	static void naive(int arr[]) { //n2 time
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>arr[i])
					break;
				count++;
			}
			System.out.println(arr[i]+": "+count);
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,12,5,20,14};
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	//	naive(arr);
		eff(arr);
	}

}
