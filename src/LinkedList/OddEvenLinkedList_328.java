package LinkedList;

public class OddEvenLinkedList_328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node oddEvenList(Node head) {
        if (head == null) return null;
        
        Node odd = head, even = head.next, evenHead = even;
        
        while (even != null && even.next != null) {
            odd.next = even.next;  // Connect odd nodes
            odd = odd.next;
            even.next = odd.next;  // Connect even nodes
            even = even.next;
        }
        
        odd.next = evenHead;  // Merge odd and even lists
        return head;
    }
}
