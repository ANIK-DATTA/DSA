package Linked_List.Singly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deletion {
	static Node front(Node head) {
		if(head == null)	
			return null;
		
		head = head.next;
		return head;
	}
	static Node end(Node head) {
		if(head == null)	
			return null;
		
		Node pt = head;
		while(pt.next.next != null) {
			pt = pt.next;
		}
		pt.next = null;
		return head;
	}
	static Node middle(Node head, int pos) {
		if(head == null)	
			return null;
		if(pos == 1)	return head.next;
		Node pt = head;
		for(int i=1;i<pos-1;i++) {
			if(pt == null)	{
				System.out.println("Error position: "+pos);
				return null;
			}
			pt = pt.next;
		}
		
		pt.next = pt.next.next;
		return head;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		Node head = new Node(23);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next =temp3;
			
		System.out.println("Before: ");
		Implementation.print(head);
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String cont;
		do {
			
			System.out.println("Enter choice for Deletion:\n1: front, 2: end, 3: middle");
			int choice = Integer.parseInt(rd.readLine());
		
			switch(choice) {
			case 1:	System.out.println("Deletion at front: ");
		        head = front(head);	
		        break;
		        
			case 2:	System.out.println("Deletion at front: ");
        		head = end(head);	
        		break;
        		
			case 3: System.out.println("Deletion at middle: \nEnter position to be deleted: ");
				int pos = Integer.parseInt(rd.readLine());
				head = middle(head, pos);	
				break;
				
			default: System.out.println("Wrong choice\n no change: ");
			}
			System.out.println("After: ");
			Implementation.print(head);
			
			System.out.println("\nDo you want to continue? then type yes else press anything else");
			cont = (rd.readLine());
			
		}while(cont.contentEquals("yes"));
		System.out.println("END");
	}

}
