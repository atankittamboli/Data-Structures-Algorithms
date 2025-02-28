package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer_138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public Node copyRandomList(Node head) {
	        if (head == null) return null;
	        
	        Map<Node, Node> map = new HashMap<>();
	        Node curr = head;
	        
	        // Step 1: Copy all nodes
	        while (curr != null) {
	            map.put(curr, new Node(curr.val));
	            curr = curr.next;
	        }

	        // Step 2: Assign next and random pointers
	        curr = head;
	        while (curr != null) {
	            map.get(curr).next = map.get(curr.next);
	            map.get(curr).random = map.get(curr.data);
	            curr = curr.next;
	        }
	        
	        return map.get(head);
	    }
}
