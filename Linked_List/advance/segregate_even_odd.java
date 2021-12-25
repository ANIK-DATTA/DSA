package Linked_List.advance;

public class segregate_even_odd {
	static Node naive(Node head) {
		Node oS = null, oE=null, eS=null, eE=null;
		for(Node pt=head;pt!=null;pt=pt.next) {
			if(pt.data%2==0) {
				if(eS==null) {
					eS = pt;
					eE = eS;
				}
				else {
					eE.next = pt;
					eE = eE.next;
				}
			}
			else {
				if(oS==null) {
					oS = pt;
					oE = oS;
				}
				else {
					oE.next = pt;
					oE = oE.next;
				}
			}
		}
		if(eS == null || oS == null)	return head;
		
		eE.next = oS;
		oE.next = null;
		return eS;
	}
	public static void main(String[] args) {
		Node head = new  Node(1);
		Node temp1 = new Node(23);
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);
		Node temp4 = new Node(50);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		System.out.println("List: ");
		Node.print(head);
		head = naive(head);
		Node.print(head);
	}

}
