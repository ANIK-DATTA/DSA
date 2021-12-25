package Linked_List.circular;
import java.io.*;
public class Insertion_End {
	static Node insert(Node head, int data) {
		Node node = new Node(data);
		if(head == null) {
			 node = node.next;
		}
		else {
			node.next = head.next;
			head.next = node;
			// node become 2nd element, interchange head and node data
			int temp = node.data;
			node.data = head.data;
			head.data = temp;	// 2nd object gets head data and 2nd object become head
		}
		return node;	
	}
	public static void main(String[] args) throws IOException{
		Node head = new Node(10);
		Node.create(head);
		System.out.print("List: ");
		Node.print(head);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter node: ");
		int data = Integer.parseInt(br.readLine());
		head = insert(head, data);
		System.out.print("After: ");
		Node.print(head);
		
	}

}
