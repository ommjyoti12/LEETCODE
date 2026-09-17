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
    public ListNode rev(ListNode s,ListNode e){
        ListNode prev=null;
        
        ListNode curr=s;
        while(curr!=e){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
    } 
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1 || head.next==null){
            return head;
        }
        ListNode s=head;
        ListNode e=head;
        int i=1;
        while(i<=k){
            while(e==null) return head;
          e=e.next;
          i++;

     
        }
        ListNode newnode =rev(s,e);
        s.next=reverseKGroup(e,k);

        return newnode; 
    }
}