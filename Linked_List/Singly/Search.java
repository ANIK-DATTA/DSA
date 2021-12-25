package Linked_List.Singly;

public class Search {
	static int Itrsearch(Node pointer, int key) {
		int pos=1;
		while(pointer != null) {
			if(pointer.data == key) 
				return pos;
			pos++;
			pointer = pointer.next;
		}
		return -1;
	}
	static int Rsearch(Node pointer, int key) {
		int pos = 1;
		if(pointer == null) return -1;
		if(pointer.data==key)	return pos;
		else {
			int res = Rsearch(pointer.next, key);
			if(res==-1)	return -1;
			else
				return res+1;
		}
		
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
		System.out.println("Linked List: ");
		Implementation.print(head);
		Node pointer = head;
		int key = 30;
		System.out.println("\nSearching: "+key);
		System.out.println("Position: "+Itrsearch(pointer, key));
		System.out.println("Recursive: "+Rsearch(pointer, key));
	}

}
