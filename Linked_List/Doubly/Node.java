package Linked_List.Doubly;

public class Node {

	int data;
	Node next;
	Node prev;
	Node(int x){
		data = x;
		next = null;
		prev = null;
	}
	static void print(Node head) {
		while(head!=null) {
			 System.out.print(head.data+" ");
			 head = head.next;
		}
		System.out.println();
	}
}











