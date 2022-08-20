// Java program to get intersection point of two linked list

class LinkedList_i {

	
	public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode a = head1;
        ListNode b = head2;
        
        while(a != b){
            if(a == null) a = head2;
            else a = a.next;
            
            if(b == null) b = head1;
            else b = b.next;
        }
        return a;
    }

}



