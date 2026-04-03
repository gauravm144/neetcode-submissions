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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode tmp=rev(slow);
        while(tmp!=null){
            if(tmp.val!=head.val)
            return false;
            tmp=tmp.next;
            head=head.next;
        }
        return true;
    }
    public ListNode rev(ListNode head){
        ListNode prev=null,nxt=null;
        while(head!=null){
            nxt=head.next;
            head.next=prev;
            prev=head;
            head=nxt;
        }
        return prev;
    }
}