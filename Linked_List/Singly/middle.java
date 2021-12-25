package Linked_List.Singly;

public class middle {
	static  int eff(Node head) {
		if(head == null)	return -1;
		Node itrBy1=head; 
		Node itrBy2=head;
		
		while(itrBy2!=null && itrBy2.next!=null) {
			itrBy1 = itrBy1.next;	//single iteration
			itrBy2 = itrBy2.next.next;	//double iteration
		}
		return  itrBy1.data;
	}
	
	static int print(Node head) {
		int len = 0;
		if(head == null)	return -1;
		Node pt = head;
		while(pt!=null) {	//finding total length of list
			pt = pt.next;
			len++;
		}
		
		pt = head;
		if(len%2==0)	len += 1;	//if even print 2nd middle, thus incrementing length by 1 
		
		for(int i=1;i<=len/2;i++) {
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
//		Node temp4 = new Node(50);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next =temp3;
//		temp3.next = temp4;
		System.out.println("LL: ");	Implementation.print(head);
		System.out.println("\nMiddle: "+print(head));
		System.out.println("Efficent Middle: "+eff(head));
	}

}
