package Linked_List.advance;

public class singly_rev_group_of_K {
	
	static Node revIterative(Node head,int k) {
		Node curr = head, prevFirst = null;
		boolean isFirstPass = true;
		
		while(curr!=null) {
			Node first = curr, prev = null;
			int count=0;
			while(curr!=null && count<k) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr=  next;
				count++;
			}
			if(isFirstPass) {
				head = prev; isFirstPass = false;
			}
			else	
				prevFirst.next = prev;
			
			prevFirst = first;
		}
		return head;
	}
	
	static Node revRecursive(Node head, int k) {
		Node curr = head, next =null, prev = null;
		int count=0;
		while(curr!=null && count<k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next!=null) {
			Node res_head = revRecursive(next,k);
			head.next = res_head;
		}
		return prev;
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
		Node.print(head);
		int k = 3;
		 head = revIterative(head,k);
		 System.out.println("Using iterative:");
		Node.print(head);
		 head = revRecursive(head,k);
		 System.out.println("Using recursive:");
		Node.print(head);
		
	}

}
