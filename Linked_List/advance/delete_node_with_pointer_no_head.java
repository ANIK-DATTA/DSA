package Linked_List.advance;



public class delete_node_with_pointer_no_head {
	static void delete(Node node) {
		System.out.println(node.data);
		node.data = node.next.data;
		node.next = node.next.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Delete: "+temp4.data);
		delete(temp3);
		Node.print(head);
	}

}
