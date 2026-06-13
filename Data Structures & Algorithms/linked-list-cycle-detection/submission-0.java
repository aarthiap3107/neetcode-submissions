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
    public boolean hasCycle(ListNode head) {
        ListNode fastptr=head;
        ListNode slowptr=head;
        while(slowptr!=null && fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        if(fastptr==slowptr){
            return true;
        }
         
    }
    return false;
}
}
