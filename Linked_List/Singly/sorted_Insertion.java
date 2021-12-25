package Linked_List.Singly;

import java.io.*;

public class sorted_Insertion {
	static Node insert(Node head, int data) {
		Node pt = head;
		Node node = new Node(data);
		if(pt == null)	return node;
		if(pt.data > node.data) {
			node.next = pt;
			return node;
		}
		while(pt.next!=null) {
			if(pt.next.data>node.data)
				break;
			pt = pt.next;
		}
		node.next = pt.next;
		pt.next = node;
		return head;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		System.out.println("Linked List:");
		Implementation.print(head);
		System.out.println("Insert new node: ");
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int node = Integer.parseInt(rd.readLine());
		head = insert(head,node);
		System.out.println("After: ");
		Implementation.print(head);
	}

}
