package Linked_List.Doubly;

public class Circular_doubly_Linked_List {
	static Node insert(Node head, int data) {
		Node node = new Node(data);
		Node rear = head.prev;
		rear.next = node;
		node.prev = rear;
		node.next =head;
		head.prev = node;
		return node;
	}
	
	static void print(Node head) {
		if(head == null)	return;
		if(head.next == head)	{
			System.out.println(head.data);
			return;
		}
		System.out.print(head.data+" ");
		Node pt = head.next;
		while(pt!=head) {
			System.out.print(pt.data+" ");
			pt = pt.next;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		head.prev = temp2;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = head;
		System.out.println("List: ");
		print(head);
		System.out.println("Insert 5 at front: ");
		head = insert(head, 5);
		print(head);
	}

}
