package Linked_List.Singly;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
	
}

public class Implementation {
	static void print(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// Creation
		Node head = new Node(10);
		Node temp1 = new Node(20);
		head.next = temp1;
		Node temp2 = new Node(30);
		temp1.next = temp2;
		Node temp3 = new Node(40);
		temp2.next = temp3;
		print(head);	//printing Linked List
	}
}
