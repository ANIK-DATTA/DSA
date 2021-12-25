package Linked_List.Singly;

import java.io.*;

public class Insertion {
	static Node front(Node head,int data) {
		Node st = new Node(data);
		st.next = head;
		return st;
	}
	
	static Node end(Node head, int data) {
		Node last = new Node(data);
		Node pt = head;
		if(pt==null)return last;
		while(pt.next!=null) {
			pt = pt.next;
		}
		pt.next = last;
		return head;
	}
	static Node middle(Node head, int data,int pos) {
		Node st = head;
		Node newNode = new Node(data);
		if(pos == 1) {
			newNode.next = head;
			return newNode;
		}
		for(int i=1;i<pos-1;i++) {
			if(st == null)	{	
				System.out.println("Impossible Position: "+pos);
				return head;
			}
			st = st.next;
		}
		newNode.next = st.next;
		st.next = newNode;
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
			System.out.println("\nEnter node value: ");
			int newNodeData = Integer.parseInt(rd.readLine());
		
			System.out.println("Enter choice for Insertion:\n1: front, 2: end, 3: middle");
			int choice = Integer.parseInt(rd.readLine());
		
			switch(choice) {
			case 1:	System.out.println("Insertion at front: ");
		        head = front(head, newNodeData);	
		        break;
		        
			case 2:	System.out.println("Insertion at front: ");
        		head = end(head, newNodeData);	
        		break;
        		
			case 3: System.out.println("Insertion at middle: \nEnter position to be inserted: ");
				int pos = Integer.parseInt(rd.readLine());
				head = middle(head, newNodeData, pos);	
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
