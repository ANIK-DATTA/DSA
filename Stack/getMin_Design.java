package Stack;

import java.util.*;
class effStack{
	Stack<Integer> s;
	int min;
	effStack(){
		s = new Stack<>();
	}
	int getMin() {
		return min;
	}
	int pop() {
		if(s.isEmpty())	return Integer.MAX_VALUE;
		if(s.peek()<=min) {
			min = 2*min-s.peek();
		}
		return s.pop();	
	}
	int top() {
		if(s.isEmpty())	return Integer.MAX_VALUE;
		if(s.peek()<=0)
			return min;
		return s.peek();
	}
	void push(int d) {
		if(s.isEmpty()) {
			s.push(d);	min=d; 
		}
		else if(min>=d) {
			s.push(2*d-min); min = d;
		}
		else
			s.push(d);
	}
}
public class getMin_Design {

	public static void main(String[] args) {
		effStack s = new effStack();
		 s.push(4);
	        s.push(5);
	        s.push(8);
	        s.push(1);
	        s.pop();
	     
	        System.out.print(" Minimum Element from Stack: " + s.getMin() );
	}

}
class naiveMyStack{ // n space O(1) time due to aux stack
	Stack<Integer> ms;		// main stack
	Stack<Integer> as;		// aux stack to store min
	naiveMyStack(){
		ms = new Stack<>();
		as = new Stack<>();
	}
	int getMin() {
		if(as.isEmpty()) 
			return Integer.MIN_VALUE;
		return as.peek();
	}
	int top() {
		if(ms.isEmpty()) 
			return Integer.MIN_VALUE;
		return ms.peek();
	}
	int pop() {
		if(ms.isEmpty()) 
			return Integer.MIN_VALUE;
		if(as.peek()==ms.peek())
			as.pop();
		return ms.pop();
	}
	void push(int d) {
		if(ms.isEmpty()) {
			ms.push(d); as.push(d); return;
		}
		ms.push(d);
		if(as.peek()>=ms.peek())
			as.push(d);
	}
}