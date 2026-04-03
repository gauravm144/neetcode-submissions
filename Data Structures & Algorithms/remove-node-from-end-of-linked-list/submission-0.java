/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=head;
        while(n--!=0){
            start=start.next;
        }
        if(start==null)
        return head.next;
        ListNode follower=head;
        while(start.next!=null){
            start=start.next;
            follower=follower.next;
        }
        follower.next=follower.next.next;
        return head;
    }
}
