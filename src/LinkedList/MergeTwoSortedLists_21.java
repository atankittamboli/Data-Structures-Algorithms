package LinkedList;

public class MergeTwoSortedLists_21 {

	public static void main(String[] args) {

		Node list1 = new Node(1);
		list1.next = new Node(2);
		list1.next.next = new Node(4);

		Node list2 = new Node(1);
		list2.next = new Node(3);
		list2.next.next = new Node(4);
		
		Node resultNode = mergeTwoLists(list1, list2);
		while(resultNode!=null) {
			System.out.println(resultNode.data);
			resultNode = resultNode.next;
		}
	}

    public static Node mergeTwoLists(Node list1, Node list2) {
        
    	Node temp = null;
    	Node result = null;
    	
    	if (list1.data < list2.data) {
            result = temp = list1;
            list1 = list1.next;
        } else {
            result = temp = list2;
            list2 = list2.next;
        }

    	
    	 while (list1 != null && list2 != null) {
             if (list1.data < list2.data) {
                 temp.next = list1;
                 list1 = list1.next;
             } else {
                 temp.next = list2;
                 list2 = list2.next;
             }
             temp = temp.next;
         }
    	
    	 temp.next = (list1 != null) ? list1 : list2;

    	return result;
    }
}
