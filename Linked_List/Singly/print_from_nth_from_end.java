package Linked_List.Singly;

public class print_from_nth_from_end {
	static int eff(Node head, int loc) {
		if(head == null)	return -1;
		
		Node pt1 = head;
		Node pt2 = head;
		for(int i=1;i<loc;i++) {
			if(pt2==null)	return -1;
			pt2 = pt2.next;
		}
		while(pt2.next!=null) {
			pt1 = pt1.next;
			pt2 = pt2.next;
		}
		
		return pt1.data;
	}
	
	static int naive(Node head, int loc) {	//USING LENGTH
		if(head == null) return -1;
		Node pt = head;
		int len=0;
		while(pt!=null) {
			len++;
			pt=pt.next;	
		}
		pt = head;

		if(loc>len)	return -1;
		for(int i=1;i<=len-loc;i++) {
			pt = pt.next;
		}
		
		return pt.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int loc = 02;
		System.out.println("\nO/p using length of list: "+naive(head, loc));
		System.out.println("O/p using two pointers: "+eff(head, loc));	
		}

}
