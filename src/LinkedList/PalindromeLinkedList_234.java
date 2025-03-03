package LinkedList;

public class PalindromeLinkedList_234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(Node head) {
	    if (head == null || head.next == null) return true;

	    Node slow = head, fast = head;
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    // Reverse second half
	    Node secondHalf = reverseList(slow);
	    Node firstHalf = head;

	    while (secondHalf != null) {
	        if (firstHalf.data != secondHalf.data) return false;
	        firstHalf = firstHalf.next;
	        secondHalf = secondHalf.next;
	    }
	    return true;
	}

	private Node reverseList(Node head) {
		Node prev = null, curr = head;
	    while (curr != null) {
	    	Node nextNode = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextNode;
	    }
	    return prev;
	}

}
