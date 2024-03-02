public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	if(list1 != null && list2 !=null) {
    		if(list1.val < list2.val) {
    			list1.next = mergeTwoLists(list1.next, list2);
    			return list1;
    		}else {
    			list2.next = mergeTwoLists(list1, list2.next);
    			return list2;
    		}
    	}
    	if(list1 != null)
    		return list1;
    	return list2;
    }
    
	public static void main(String[] args) {
		MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
		ListNode listNode3 = new ListNode(4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);
		
		ListNode listNode6 = new ListNode(4);
		ListNode listNode5 = new ListNode(3, listNode6);
		ListNode listNode4 = new ListNode(1, listNode5);
		
		ListNode result = mergeTwoSortedList.mergeTwoLists(listNode1, listNode4);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

}
