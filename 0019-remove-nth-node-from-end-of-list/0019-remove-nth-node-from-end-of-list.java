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
        ListNode dumy= new ListNode (0);
        dumy.next=head;
      ListNode slow=dumy;
      ListNode first=dumy;
      for(int i=0;i<=n;i++){
        first= first.next;
      }  
      while(first !=null){
        slow=slow.next;
        first=first.next;
      }
      slow.next=slow.next.next;
      return dumy.next;


    }

}