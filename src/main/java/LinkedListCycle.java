import java.util.HashSet;

public class LinkedListCycle {
	
    public boolean hasCycle(ListNode head) {
    	HashSet<ListNode> visitedNodes = new HashSet<ListNode>();
    	ListNode currentNode = head;
    	while(currentNode != null) {
    		if(visitedNodes.contains(currentNode)) {
    			return true;
    		}
    		visitedNodes.add(currentNode);
    		currentNode = currentNode.next;
    	}
    	return false;
    }

	public static void main(String[] args) {
		
		LinkedListCycle linkedListCycle = new LinkedListCycle();
		
		ListNode listNode1 = null;
		
		ListNode listNode3 = new ListNode(4, listNode1);
		ListNode listNode2 = new ListNode(2, listNode3);
		listNode1 = new ListNode(1, listNode2);
		
		ListNode listNode6 = new ListNode(4);
		ListNode listNode5 = new ListNode(3, listNode6);
		ListNode listNode4 = new ListNode(1, listNode5);
		
		System.out.print(linkedListCycle.hasCycle(listNode1));
	}

}
