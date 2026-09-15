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
    public ListNode mergeKLists(ListNode[] lists) {
      if (lists == null || lists.length == 0) {
    return null;
}
        return merges(lists,0,lists.length-1);
    }

    private ListNode merges(ListNode [] lists,int left,int right){
  if (left > right) return null; 
        if (left==right) return lists[left];
               int mid=left+(right-left)/2;

               ListNode l1= merges(lists,left,mid);
               ListNode l2=merges(lists,mid+1,right);

               return merg(l1,l2);


    }
    private ListNode merg(ListNode l1,ListNode l2){
        ListNode dumy =new ListNode(0);
        ListNode curr=dumy;
        while(l1 !=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next; 

            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }

        while( l1!=null){
            curr.next=l1;
            l1=l1.next;
            curr=curr.next;
        }
        while(l2 !=null){
              curr.next=l2;
              l2=l2.next;
              curr=curr.next;
        }

        return dumy.next;
    }
}