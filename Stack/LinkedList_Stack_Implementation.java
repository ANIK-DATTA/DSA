package Stack;

class llstack{
	Node head;
	int size;
	
	llstack(){
		head=null;
		size=0;
	}
	void push(int x) {
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		size++;
	}
	int peek() {
		if(head==null) return -1;
		return head.data;
	}
	int pop() {
		if(head==null)	return -1;
		int res = head.data;
		head = head.next;
		size--;
		return res;
	}
	int size() {
		return size;
	}
    boolean isEmpty(){
        return head==null;
    }
}



class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}


public class LinkedList_Stack_Implementation {

	public static void main(String[] args) {
		llstack s = new llstack();
		s.push(9);
		System.out.println(s.size());
		System.out.println(s.peek());
		s.push(22);
		s.push(2);
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());

	}

}
