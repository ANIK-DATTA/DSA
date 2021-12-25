package Linked_List.advance;

public class Palindrome {	
	static boolean check(Node head) {
		if(head==null) return false;
		if(head.next == null) return true;
		Node mid = middle(head);
		Node end = reverse(mid);
		Node pt=head;
		while(end!=null) {
			if(pt.data != end.data)	return false;
			end = end.next;
			pt = pt.next;
		}
		return true;
	}
	static Node reverse(Node head) {
		Node prev = null, pt=head;
		while(pt!=null) {
			Node next = pt.next;
			pt.next = prev;
			prev = pt;
			pt = next;
		}
		return prev;
	}

	static Node middle(Node head) {
		Node slow =head, fast=head;
		while(fast!=null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(20);
		Node temp4 = new Node(10);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		Node.print(head);
		System.out.println("Is Palindrome: "+check(head));
	}

}
