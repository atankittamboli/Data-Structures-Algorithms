package LinkedList;

public class RotateList_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node rotateRight(Node head, int k) {
	    if (head == null || head.next == null || k == 0) return head;

	    // Compute length
	    int len = 1;
	    Node tail = head;
	    while (tail.next != null) {
	        tail = tail.next;
	        len++;
	    }

	    // Create circular list
	    tail.next = head;
	    k = k % len;
	    int stepsToNewHead = len - k;
	    
	    // Find new tail and break cycle
	    Node newTail = head;
	    for (int i = 1; i < stepsToNewHead; i++) {
	        newTail = newTail.next;
	    }

	    Node newHead = newTail.next;
	    newTail.next = null;
	    return newHead;
	}

}
