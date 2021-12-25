package Queue;
class llQueue{
	Node front, rear;
	
	llQueue(){
		this.front = this.rear = null;
	}
	void enque(int d) {
		Node temp = new Node(d);
		if(rear == null) {
			front = rear = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
	
	}
	void deque() {
		if(front == null)	return;
		//Node temp = front;	
		front = front.next;
		if(front == null)
			rear = null;
		
	}
}
public class LL_Implementation {
	public static void main(String args[]) {
	llQueue q = new llQueue(); 
	q.enque(10);
	q.enque(20); 
	q.deque(); 
	q.deque(); 
	q.enque(30); 
	q.enque(40); 
	q.enque(50); 
	
	System.out.println("Queue Front : " + q.front.data); 
	System.out.println("Queue Rear : " + q.rear.data); 
	}
}
class Node{
	int data;
	Node next;
	Node(int d){
		data  =d;
		next = null;
	}
}