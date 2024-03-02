public class ReverseLinkedList {
	
    public ListNode reverseList(ListNode head) {
    	ListNode preListNode = null;
    	ListNode currentListNode = head;
    	while(currentListNode != null){
    		ListNode next = currentListNode.next;
    		currentListNode.next = preListNode;
    		preListNode =  currentListNode;
    		currentListNode = next;
    	}
    	return preListNode;
    }

	public static void main(String[] args) {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		ListNode listNode3 = new ListNode(3);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);
		ListNode result = reverseLinkedList.reverseList(listNode1);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

}
