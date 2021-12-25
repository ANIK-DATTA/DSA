package Linked_List.circular;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		System.out.println("List: ");
		Node.print(head);
		System.out.println();
		Node.print2(head);
		System.out.println();
		Node.print3(head);
	}

}
