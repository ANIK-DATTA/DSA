package Linked_List;



public class test {
	static void merge(Node a, Node b) {
		if(a==null)	{Node.print(b); return;}
		if(b==null) {Node.print(a); return;}
		Node head=null, tail=null;
		if(a.data>=b.data) {	head=tail=b; 	b=b.next;	}
		else {	head=tail=a; 	a=a.next;	}
		while(a!=null && b!=null) {
			if(a.data>=b.data) {	tail.next = b; tail=tail.next; 	b=b.next;	}
			else { tail.next = a; tail=tail.next; 	a=a.next; }
		}
		if(a==null)	tail.next = b;
		else tail.next = a;
		Node.print(head);
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
		merge(head1, head2);
		
	}



}


class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
	static void print(Node head) {
		if(head==null)	return;	
		while(head!=null) {
			 System.out.print(head.data+" ");
			 head = head.next;
		}
		System.out.println();
	}
}
