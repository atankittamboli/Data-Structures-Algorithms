package LinkedList;

public class SortList_148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node sortList(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left, right);
    }

    // Function to find the middle of the list
    private Node getMid(Node head) {
    	Node prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) prev.next = null;  // Split the list into two halves
        return slow;
    }

    // Function to merge two sorted lists
    private Node merge(Node l1, Node l2) {
    	Node dummy = new Node(0), tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}
