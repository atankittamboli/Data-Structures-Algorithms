package LinkedList;

public class DeletionLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		System.out.println(" ----------- Original List -----------");
		traverseList(head);
		System.out.println(" ----------- Deletion in First -----------");
		Node node = deletionNodeFirst(head);
		traverseList(node);
		System.out.println(" ----------- Deletion Node at Specific position -----------");
		int pos = 2;
		Node nodePosition = DeletionNodeSpecificPosition(head, pos);
		traverseList(nodePosition);
		System.out.println(" ----------- Deletion in last -----------");
		Node nodeLast = deletionNodeLast(head);
		traverseList(nodeLast);

	}

	public static Node DeletionNodeSpecificPosition(Node head, int pos) {
		
		Node temp = head;
		Node previousNode = null;
		
		if(pos==1) {
			head = head.next;
			return head;
		}
		
		for(int i=1; temp!=null && i<pos  ; i++) {
			previousNode = temp;
			temp = temp.next;
		}
		
		if(temp!=null) {
			previousNode.next = temp.next;
		}
		
		return head;
	}

	public static Node deletionNodeLast(Node head) {		
		Node curr = head;		
		while(curr.next.next!=null) {
			curr = curr.next;
		}
		curr.next=null;
		return head;
	}
	
	public static Node deletionNodeFirst(Node head) {		
		head = head.next;
		 return head;
	}

	public static void traverseList(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head  = head.next;
		}
		System.out.println();
	}
}
