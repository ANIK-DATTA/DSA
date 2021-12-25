package Linked_List.Singly;

public class remove_duplicates_sorted_list {
	static Node remove(Node head) {
		Node pt = head;
		if(pt==null)	return null;
		while(pt.next!=null) {
			
			if(pt.data == pt.next.data)
				pt.next = pt.next.next;
			else
				pt = pt.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Node head = new Node(20);
		Node temp1 = new Node(20);
		Node temp2 = new Node(20);
		Node temp3 = new Node(30);
		Node temp4 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next =temp3;
		temp3.next = temp4;
		System.out.println("LL: ");	Implementation.print(head);
		System.out.println("\nRemove duplicates");
		head = remove(head);
		Implementation.print(head);
	}

}
