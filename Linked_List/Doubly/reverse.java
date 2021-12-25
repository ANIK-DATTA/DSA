package Linked_List.Doubly;

public class reverse {
	static Node rev(Node head) {
		// swapping next with prev
		if(head == null || head.next == null)	return head;		
		Node pt = null;
		while(head!=null) {
			pt = head.prev;
			head.prev = head.next;
			head.next = pt;
			
			head = head.prev;	// prev bcom next
		}
		return pt.prev;	// pt is on 2nd last thus to return last element
	}
	
	static void revprint(Node head) {
		Node pt = head;
		while(pt.next!=null)
			pt = pt.next;
		while(pt!=null) {
			System.out.print(pt.data+" ");
			pt = pt.prev;
		}
		System.out.println();
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
		System.out.println("After:");
		revprint(head);
		System.out.println("Actural reverse: ");
		head = rev(head);
		Node.print(head);
	}

}
