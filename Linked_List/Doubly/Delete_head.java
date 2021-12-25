package Linked_List.Doubly;

public class Delete_head {
	static Node delete(Node head) {
		if(head == null || head.next == null)	return null;
		head = head.next;
		head.prev = null;
		return head;
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
		System.out.println("Delete at head: ");
		head = delete(head);
		Node.print(head);
	}

}
