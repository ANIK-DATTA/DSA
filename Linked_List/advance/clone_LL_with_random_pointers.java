package Linked_List.advance;
import java.util.*;
public class clone_LL_with_random_pointers {
	static void eff(rNode head){
		rNode pt=head,next;
		// step1: linking original and duplicate
		while(pt!=null) {
			next = pt.next;
			pt.next  = new rNode(pt.data);
			pt.next.next = next;
			pt = next;
		}
		// step2: linking random pointers
		pt=head;
		while(pt!=null) {
			pt.next.random = (pt.random!=null)?(pt.random.next):null;
			// clone.random = real.random
			pt = pt.next.next;
		}
		// step3: separate
	 rNode org = head, cloneHead = head.next;
	 pt = cloneHead;
	 while(org!=null && pt!=null) {
		 //breaking
		 org.next = (org.next!=null) ? org.next.next: org.next;
		 pt.next =  (pt.next!=null) ? pt.next.next: pt.next;
		 // moving forward
		 org = org.next;
		 pt = pt.next;
	 }
	 
	 //printing
	 rNode.print(cloneHead);
	 
	}
	static void naive(rNode head) {	// HashMap method n time and n space
		HashMap<rNode, rNode> map = new HashMap<>(); // map= {10:10, 5:5, 20:20, 15:15, 20:20}
		for(rNode pt=head; pt!=null; pt=pt.next) { 
			map.put(pt, new rNode(pt.data));
		}
		for(rNode pt=head; pt!=null; pt=pt.next) {
			rNode clone = map.get(pt);
			clone.next = map.get(pt.next);
			clone.random = map.get(pt.random);
		}
		rNode head2 = map.get(head);
		rNode.print(head2);
	}
	public static void main(String[] args) {
		rNode head = new rNode(10);
		head.next = new rNode(5);
		head.next.next = new rNode(20);
		head.next.next.next = new rNode(15);
		head.next.next.next.next = new rNode(20);
		
		head.random = head.next.next;
		head.next.random = head.next.next.next;
		head.next.next.random=head;
	    head.next.next.next.random=head.next.next;
	    head.next.next.next.next.random=head.next.next.next;
	    System.out.println("Before: ");
	    rNode.print(head);
//	    System.out.println("Using HashMap n time and n space: ");
//	    naive(head);
	    System.out.println("Using Linking and Breaking  n time and 1 space: ");
	    eff(head);
	}

} 




class rNode{
	int data;
	rNode next, random;
	rNode(int x){
		data=x;
		next = random =null;
	}
	static void print(rNode head) {
		while(head!=null) {
			System.out.println("Data: "+head.data+", Random: "+head.random.data);
			head= head.next;
		}
		System.out.println();
	}
}