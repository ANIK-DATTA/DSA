package Linked_List.Singly;

public class Recursive_Print {		// n time and n space bcoz storage of function with each recursion all
	static void print(Node curr) { // taking place		
		if(curr == null)	return;
		System.out.print(curr.data+" ");
		print(curr.next);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);	
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		
		head.next = temp1;
		temp1.next = temp2;
		temp2.next =temp3;
		Node curr = head;
		print(curr);
	}

}
