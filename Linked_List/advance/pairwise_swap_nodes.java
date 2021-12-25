package Linked_List.advance;

public class pairwise_swap_nodes {
	
	static Node swap2(Node head){
		if(head==null || head.next ==null)
			return head;
		Node curr = head.next.next; // curr = 3
		Node prev = head; // 1
		head = head.next; // 2
		head.next = prev; // 2->1
		while(curr!=null && curr.next!=null) {
			prev.next = curr.next; // 1->4
			prev = curr; // 3
			Node next = curr.next.next; // 5
			curr.next.next = curr; // 4->3
			curr=next; //5
		}
		prev.next = curr; // 3->5
		return head;
	} // 2->1->4->3->5 
	static Node swap1(Node head) { // change data can  be costly if data is not int but big data
		Node pt = head;	 // time n
		while(pt!=null && pt.next!=null) {
			int temp = pt.data;	// swapping
			pt.data = pt.next.data;
			pt.next.data = temp;
			
			pt = pt.next.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Node head = new  Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		Node temp4 = new Node(50);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		System.out.print("List: ");
		Node.print(head);
		System.out.print("Swap data naive: ");
		head = swap1(head);
		Node.print(head);
		System.out.print("Swap link eff: ");
		head = swap2(head);
		Node.print(head);
	}

}
