package Linked_List.circular;

import java.util.Scanner;

public class Insertion_Front {
	
	static Node eff(Node head, int data) {	// 1 time
		Node node = new Node(data);
		if(head == null) {	
			node = node.next;
			return node;
		}		
		node.next = head.next;
		head.next = node;	// now node become 2nd node
		// interchange data of head with node to make node 1st element
		interchange(head, node);
		return head;
	}
	static void interchange(Node node1, Node node2) {	// 1 time
		int temp  = node1.data;
		node1.data = node2.data;
		node2.data = temp;
	}
	
	
	static Node finsert(Node head, int data) {	// n time
		Node node = new Node(data);
		if(head == null) 
			node.next = node;
		else {
			Node pt = head;
			while(pt.next!=head) {
				pt = pt.next;
			}			
			pt.next = node;
			node.next = head;
		}
		return node;
	}
	
	
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = head;
		System.out.println("List: ");
		Node.print(head);
		
		System.out.println("Enter node: ");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		sc.close();
		System.out.println("After: ");
		head = eff(head, data);
		Node.print(head);
	}

}
