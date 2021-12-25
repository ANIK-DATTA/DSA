package Queue;
import java.util.*;
public class java_queue_collection {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		System.out.println(q.peek());
		
		q.offer(10);
		q.offer(20);
		q.add(25);
		q.offer(30);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
	}

}
