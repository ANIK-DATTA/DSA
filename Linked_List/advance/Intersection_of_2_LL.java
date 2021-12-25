package Linked_List.advance;
import java.util.*;
public class Intersection_of_2_LL {
	

	static int getNode(Node head1, Node head2) 
	{ 
		int c1 = getCount(head1); 
		int c2 = getCount(head2); 
		int d; 

		if (c1 > c2) { 
			d = c1 - c2; 
			return _getIntesectionNode(d, head1, head2); 
		} 
		else { 
			d = c2 - c1; 
			return _getIntesectionNode(d, head2, head1); 
		} 
	} 

	static int _getIntesectionNode(int d, Node node1, Node node2) 
	{ 
		int i; 
		Node current1 = node1; 
		Node current2 = node2; 
		for (i = 0; i < d; i++) { 
			if (current1 == null) { 
				return -1; 
			} 
			current1 = current1.next; 
		} 
		while (current1 != null && current2 != null) { 
			if (current1.data == current2.data) { 
				return current1.data; 
			} 
			current1 = current1.next; 
			current2 = current2.next; 
		} 

		return -1; 
	} 

	static int getCount(Node node) 
	{ 
		Node current = node; 
		int count = 0; 

		while (current != null) { 
			count++; 
			current = current.next; 
		} 

		return count; 
	} 
	
	
	
	//main
	
	
	public static void main(String[] args) {
		Node head1 = new Node(2);
		Node temp1 = new Node(5);
		Node temp2 = new Node(10);
		Node head2 = new Node(8);
		Node temp3 = new Node(9);
		Node temp4 = new Node(12);
		Node temp5 = new Node(20);
		head1.next = temp1;
		temp1.next = temp2;
		temp2.next = temp4;
		temp4.next = temp5;
		head2.next = temp3;
		temp3.next = temp4;
		System.out.println("List1:");
		Node.print(head1);
		System.out.println("List2:");
		Node.print(head2);
		System.out.println("Using hashSet Intersection at: "+naive(head1, head2));
		System.out.println("Eff: "+getNode(head1, head2));
	}
	
	static int naive(Node head1, Node head2) { // (m+n) time
		HashSet<Integer> set = new HashSet<>();
		while(head1!=null) {
			set.add(head1.data);
			head1 = head1.next;
		}
		while(head2!=null) {
			if(set.contains(head2.data)) {
				return head2.data;
			}
			
			head2 = head2.next;
		}
		return 0;
	}
}
