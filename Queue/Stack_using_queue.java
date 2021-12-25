package Queue;
import java.util.*;
class stack1{
	Queue<Integer> q1 = new ArrayDeque<>();
	Queue<Integer> q2 = new ArrayDeque<>();
	int peek() {return q1.peek();}
	int size()	{return q1.size();}
	int pop() {return  q1.poll();}
	void push(int d) {
		while(!q1.isEmpty()) {		// putting q1 data to q2
			q2.add(q1.peek());
			q1.poll();
		}
		q1.offer(d);				// adding new data to q1
		while(q2.isEmpty()==false) {	// moving back q2 to q1
			q1.offer(q2.peek());
			q2.poll();
		}
	}
}
public class Stack_using_queue {
	
	public static void main(String[] args) {
		stack1 s = new stack1();
		System.out.println(s.size());
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
	}

}
