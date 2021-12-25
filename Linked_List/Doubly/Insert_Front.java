package Linked_List.Doubly;

public class Insert_Front {
	static Node insert(Node head, int data) {
		Node node = new Node(data);
		if(head == null)	return node;
		node.next = head;
		head.prev = node;
		return node;
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		Node.print(head);
		int data = 2;
		head = insert(head, data);
		System.out.println("After:");
		Node.print(head);
	}

}
