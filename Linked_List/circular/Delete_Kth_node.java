package Linked_List.circular;

public class Delete_Kth_node {
	static Node delete(Node head, int k) {	// n times
		if(k ==1)	{
			head.data = head.next.data;
			head.next = head.next.next;
		}
		else {
			Node pt = head;
			for(int i=1;i<k-1;i++) {
				pt = pt.next;
			}
			pt.next = pt.next.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		Node.create(head);
		System.out.print("List: ");
		Node.print(head);
		int k = 1;	// assuming k less than size of list
		head = delete(head,k);
		Node.print(head);
	}

}
