package Linked_List.Singly;

import java.io.*;

public class test {
	static  Node rev(Node head) {
		if(head ==null || head.next == null)	return head;
		Node newHead = rev(head.next);
		Node rear = head.next;
		rear.next = head;
		head.next = null;
		return newHead;
	}
	public static void main(String[] args) throws IOException {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		Node temp4 = new Node(50);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next =temp3;
		temp3.next = temp4;
		System.out.println("LL: ");	Implementation.print(head);
		System.out.println("\nPrint using len: ");
		head = rev(head);
		Implementation.print(head);
	}

}
