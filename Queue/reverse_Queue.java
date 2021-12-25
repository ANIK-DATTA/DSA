package Queue;
import java.util.*;
public class reverse_Queue {
	static Queue<Integer> q =  new ArrayDeque<>();; 
	static void reverse() {
		Stack<Integer> s = new Stack<>();
		
		while(q.isEmpty()==false) {	// adding to stack	which will reverse the order while pop
			s.push(q.peek());
			q.poll();
		}
		while(s.isEmpty()==false) {	// putting back into queue
			q.offer(s.pop());
		}
	}
	
	public static void main(String[] args) {
	//	q = new ArrayDeque<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q);
		reverse();
		System.out.println(q);
	}

}
