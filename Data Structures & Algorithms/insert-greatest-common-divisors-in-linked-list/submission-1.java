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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode nxt=null;
        ListNode prev=null;
        ListNode ans=head;
        while(head.next!=null){
            nxt=head.next;
            prev=head;
            ListNode tmp=new ListNode(findHCF(nxt.val,prev.val));
            prev.next=tmp;
            tmp.next=nxt;
            head=nxt;
        }
        return ans;
    }
    int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}