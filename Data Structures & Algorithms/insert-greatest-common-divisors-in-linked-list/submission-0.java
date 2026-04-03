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
    public int findHCF(int a, int b) {
    int hcf = 1;
    // Iterate from 1 to the smaller of the two numbers
    for (int i = 1; i <= a && i <= b; i++) {
        if (a % i == 0 && b % i == 0) {
            hcf = i; // Update HCF when a common factor is found
        }
    }
    return hcf;
}
}