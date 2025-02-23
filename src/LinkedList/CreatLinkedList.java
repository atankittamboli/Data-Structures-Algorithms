package LinkedList;

public class CreatLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		traverseList(head);
//		recursiveTraverseList(head);
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

}
