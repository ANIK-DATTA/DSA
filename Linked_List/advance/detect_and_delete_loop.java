package Linked_List.advance;

public class detect_and_delete_loop {
	static void remove(Node head) {
		Node slow = head, fast = head;
		while(fast!=null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
				break;
		}
		if(slow!=fast)	return;
		
		slow = head;
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		Node temp4 = new Node(50);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp2;
		remove(head);
		Node.print(head);
	}

}
