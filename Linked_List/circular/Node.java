package Linked_List.circular;



public class Node {

	int data;
	Node next;
	public Node(int d){
		data = d;
		next = null;
	}
	
	static void create(Node head) {	//default creation
		
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = head;

	}
	
	static void print(Node head) {
		if(head == null)	return;
		Node r = head;
		do{
			System.out.print(r.data+" ");
			r = r.next;
		}while(r!=head);
		System.out.println();
	}
	
	static void print2(Node head) {
		if(head==null)	return;
		Node r =head.next;
		System.out.print(head.data+" ");
		for(r=head.next; r!=head; r=r.next) {
			System.out.print(r.data+" ");
		}
	}
	
	
	static void print3(Node head) {
		if(head == null)	return;
		Node r = head.next;
		System.out.print(head.data+" ");
		while(r!=head) {
			System.out.print(r.data+" ");
			r = r.next;
		}
	}
	
}