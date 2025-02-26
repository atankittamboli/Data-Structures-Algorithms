package LinkedList;

public class IntersectionofTwoLinkedLists_160 {

	public static void main(String[] args) {
		
		
	}

	public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;
        
        Node a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}
