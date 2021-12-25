package Linked_List.circular;

public class Deletion_end {
	static void delete(Node head) {
		if(head == null)	return;
		Node tail = head.next;
		while(tail.next.next!=head) {
			tail = tail.next;
		}
		tail.next = head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node.create(head);
		System.out.print("List: ");
		Node.print(head);
		System.out.println("Deletion from end: ");
		delete(head);
		Node.print(head);
	}

}
