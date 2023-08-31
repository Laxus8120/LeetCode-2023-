class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(0,head);
        ListNode curr = dummy;
        int count = 0;
        int k = 0;
        if(head== null || head.next== null){
            return null;
        }
        
        while (curr.next != null){
            curr= curr.next;
            count++;
        }
        curr = dummy;
        k = count - n; 
        count = 0; 
        if(k == 0){
            head = head.next;
        }
        else{
        while (count != k && curr.next != null){
            curr = curr.next;
            count++;
        }
        }
        curr.next = curr.next.next;
        return head;     
    }
}