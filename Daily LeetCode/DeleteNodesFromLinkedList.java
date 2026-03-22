import java.util.*;
class ListNode 
 {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class DeleteNodesFromLinkedList {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        // scanning the entire linked list
        while(head!=null && set.contains(head.val))
        {
            head=head.next;
        }

        ListNode temp=head;
        ListNode slow=null;
        while(temp!=null)
        {
            if(set.contains(temp.val))
            {
                slow.next=temp.next;
            }
            else{
                slow=temp;
            }
            temp=temp.next;
        }
        return head;
    }
     
}
