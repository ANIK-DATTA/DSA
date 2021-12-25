package Linked_List.advance;
import java.util.*;

public class detect_loop {
	static boolean floydCycle(Node head) {
		Node slow = head, fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)	return true;
		}
		return false;
	}
	
	static boolean hashmethod(Node head) {	// O(n) space and time
		HashSet<Node> set = new HashSet<>();
		for(Node pt=head;pt!=null;pt=pt.next) {
			if(set.contains(pt) == true)	return true;
			else
				set.add(pt);
		}
		return false;
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		Node temp4 = new Node(50);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp2;
		System.out.println("Detect loop using floyd cycle detection: "+floydCycle(head));
		System.out.println("Using hash method:  "+hashmethod(head));
		System.out.println("Dummy node method: "+dummyNode(head));
		
//		System.out.println("Naive Double loop n2 method: "+doubleLoop_naive(head));
		
	}

	static boolean dummyNode(Node head) {		// destroys LL linking
		Node dummy = new Node(0), pt = head;
		while(pt!=null){
			if(pt.next==null)	return false;
			if(pt.next==dummy)	return true;
			
			Node next = pt.next;
			pt.next = dummy;
			pt = next;
		}
		return false;
	}
	
    static boolean doubleLoop_naive(Node head) {	//bug
		for(Node i = head; i.next!=null; i= i.next) {
			Node temp = i.next;
			for(Node j=head;	j!=i.next;	j =j.next) {
				if(j == temp)	return true;
			}
		}
		return false;
	}
	
	

}
