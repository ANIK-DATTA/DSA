package Linked_List.Singly;

import java.util.ArrayList;

public class reverse {
	static Node eff(Node head) {
		if(head==null)	return null;
		Node prev = null;
		Node pt = head;
		while(pt!=null) { // 3 pointers
			Node next = pt.next;
			pt.next = prev;
			prev = pt;
			pt = next;
		}
		return prev;
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
		System.out.println("LL: ");	Implementation.print(head);
		head = naive(head);
		System.out.println("\nAfter: naive");
		Implementation.print(head);
		System.out.println("\nreverse eff: ");
		head = eff(head);
		Implementation.print(head);
		
	}
	
	static Node naive(Node head) {
		if(head == null || head.next == null)	return head;
		Node pt = head;
		ArrayList<Integer> arr = new ArrayList<>();
		while(pt!=null) {
			arr.add(pt.data);		
			pt = pt.next;
		}
		for(pt=head; pt!=null;pt=pt.next) {
			pt.data = arr.remove(arr.size()-1);
		}
		return head;
	}
}
