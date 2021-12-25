package Linked_List.Singly;

public class recursive_reverse {
	
	static Node method2(Node head, Node prev) {
		if(head == null)	//prev = null 
			return prev;
		
		Node next = head.next;
		head.next = prev;
		return method2(next, head);
	}
	
	static Node method1(Node head) {
		if(head == null || head.next == null)
			return head;
		
		Node end = method1(head.next);
		
		Node resRear = head.next;
		resRear.next = head;
		head.next= null;
		return end;	//end become head
	}
	public static void main(String[] args) {
		Node head = new Node(23);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		Node temp4 = new Node(50);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next =temp3;
		temp3.next = temp4;
		System.out.println("LL: ");	
		Implementation.print(head);
		head = method1(head);
		System.out.println("Method1: ");
		Implementation.print(head);
		System.out.println("Method2: ");
		head = method2(head, null);
		Implementation.print(head);
	}

}
