package LinkedList;

public class CreatLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
						
		System.out.println(" ----------- Create List with 4 Node -----------");
		traverseList(head);
		System.out.println(" ----------- Create List with 100 Node -----------");
		traverseList(createList());
		System.out.println(" ----------- print LinkedList with Recursive Method -----------");
		recursiveTraverseList(head);
	}
	
	public static void traverseList(Node head) {		
		while(head != null) {
			System.out.println(head.data);
			head  = head.next;
		}
	}

	public static void recursiveTraverseList(Node head) {		
		if(head == null) {
			return;
		}
		System.out.println(head.data);		
		recursiveTraverseList(head.next);
	}
	
	public static Node createList() {
		Node node = new Node(1);
		Node currNode = node;

		for (int i = 2; i <= 100; i++) {
			currNode.next = new Node(i);
			currNode = currNode.next;
		}
		return node;
	}
	
}