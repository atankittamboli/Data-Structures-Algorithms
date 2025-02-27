package LinkedList;

public class ReverseLinkedList_206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node reverseList(Node head) {
		Node prev = null, curr = head;
	    while (curr != null) {
	    	Node nextNode = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextNode;
	    }
	    return prev; // New head
	}

}
