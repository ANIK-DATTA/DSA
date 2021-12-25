package Linked_List.advance;

public class Merge_2_sorted_LL {
	static Node merge(Node a, Node b) {
		if(a==null)	return b;	//step 0:
		if(b==null)	return a;
		Node head = null, tail=null;	//step 1: deciding head
		if(a.data>=b.data) {
			head = b;	tail = b;	b = b.next;		
		}
		else { 
			head = a; tail = a; 	a=a.next;	
		}
		while(a!=null && b!=null) {			//step 2: merging
			if(a.data<=b.data) {
				tail.next = a;	tail = tail.next; 	a=a.next;
			}
			else {
				tail.next = b;	tail = tail.next;	b=b.next;
			}
		}
		if(a==null)	tail.next = b;
		else	tail.next = a;
		return head;
	}
	public static void main(String[] args) {
		Node head1 = new Node(10);
		head1.next = new Node(15);
		head1.next.next = new Node(18);
		head1.next.next.next = new Node(35);
		head1.next.next.next.next = new Node(45);
		System.out.print("List1: "); Node.print(head1);
		Node head2 = new Node(5);
		head2.next = new Node(12);
		head2.next.next = new Node(18);
		head2.next.next.next = new Node(20);
		System.out.print("List2: "); Node.print(head2);
		System.out.println("Merge LL: ");
		Node head = merge(head1, head2);
		Node.print(head);
	}

}
