package LinkedList;

public class InsertionLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		System.out.println(" ----------- Original List -----------");
		traverseList(head);		
		System.out.println(" ----------- insertion in First -----------");
		Node node = insertNodeFirst(head);
		traverseList(node);
		System.out.println(" ----------- insertion in last -----------");
		Node nodeLast = insertNodeLast(head);
		traverseList(nodeLast);
		System.out.println(" ----------- insertion Node at Specific position -----------");
		int pos = 3;
		int data = 70;
		Node nodePosition = insertNodeSpecificPosition(head, pos, data);
		traverseList(nodePosition);
		System.out.println(" ----------- Insert a Node after a given Node in Linked List -----------");
		int key = 10;
		int new_data = 80;
		Node afterPosition = insertNodeAfterPosition(head, key, new_data);
		traverseList(afterPosition);
		System.out.println(" ----------- Insert a node in Linked List before a given node -----------");
		int keyVal =60;
		int new_dataVal = 90;
		Node beforePosition = insertNodeBeforePosition(head, keyVal, new_dataVal);
		traverseList(beforePosition);
		
	}
	
	public static Node insertNodeFirst(Node head) {
		 Node new_node = new Node(50);
		 new_node.next = head;
		 return new_node;
	}

	public static Node insertNodeLast(Node head) {
		 
		Node last_node = new Node(60);
		if(head==null) {
			return last_node;
		}
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = last_node;
		 return head;
	}

	public static Node insertNodeSpecificPosition(Node head, int pos, int data) {
		
		Node newNode  = new Node(data);
		if(pos<1) {
			return head;
		}
				
		if(pos==1) {
			newNode.next = head;
			return newNode;
		}
		
		Node curr = head;
		for(int i=1; i<pos-1 && curr!=null; i++) {
			curr = curr.next;
		}
		
		if(curr==null) {
			return head;
		}
				
		newNode.next = curr.next;
		curr.next = newNode;

		return head;
	}

	public static Node insertNodeAfterPosition(Node head, int key, int data) {		
		Node newNode  = new Node(data);
		Node curr = head;
				
		while(curr!=null) {
			if(curr.data==key) {
				break;
			}
			curr = curr.next;
		}		
		newNode.next= curr.next;
		curr.next= newNode;
		return head;
	}

	public static Node insertNodeBeforePosition(Node head, int key, int data) {		
		Node newNode  = new Node(data);
		Node curr = head;

		if(curr.data==key) {
			newNode.next=head;
			return newNode;
		}
		
		Node prev = null;
		while(curr!=null && curr.data!=key) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr!=null) {
			prev.next = newNode;
			newNode.next = curr;
		}
		
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
