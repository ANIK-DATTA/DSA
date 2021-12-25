package Linked_List.Doubly;

public class Delete_End {
	static Node delete(Node head) {
		if(head == null || head.next==null)	return null;
		Node pt = head;
		while(pt.next!=null) {
			pt = pt.next;
		}
		pt.prev.next = null;
		pt.prev = null;
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
		System.out.println("Delete at end: ");
		head = delete(head);
		Node.print(head);
	}

}
