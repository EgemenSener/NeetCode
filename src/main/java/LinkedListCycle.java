import java.util.HashSet;

public class LinkedListCycle {
	
    public boolean hasCycle(ListNode head) {
    	HashSet<ListNode> visitedNodes = new HashSet<ListNode>();
    	ListNode currentNode = head;
    	while(currentNode != null) {
    		if(visitedNodes.contains(currentNode)) 
    			return true;
    		visitedNodes.add(currentNode);
    		currentNode = currentNode.next;
    	}
    	return false;
    }

	public static void main(String[] args) {
		
		LinkedListCycle linkedListCycle = new LinkedListCycle();
		
		ListNode listNode2 = null;		
		ListNode listNode4 = new ListNode(-4, listNode2);
		ListNode listNode3 = new ListNode(0, listNode4);
		listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(3, listNode2);
		
		System.out.print(linkedListCycle.hasCycle(listNode1));
	}

}
