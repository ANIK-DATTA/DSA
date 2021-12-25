package Linked_List.circular;

public class Deletion_front {
	static Node eff(Node head) {
		if(head==null)	return null;
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}
	
	static Node delete(Node head) {	// n time
		if(head == null)		return null;
		Node tail = head.next;
		while(tail.next!=head) {
			tail = tail.next;
		}
		tail.next = tail.next.next;
		return tail.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head =new Node(10);
		Node.create(head);
		System.out.print("Lst: ");
		Node.print(head);
		System.out.println("Deleting front: ");
		head = eff(head);
		Node.print(head);
	}

}
