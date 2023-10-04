package com.weng;

public class LeetCode206_ReverseList
{
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode pre=null;
        ListNode temp;

        while (current!=null)
        {
            temp=current.next;
            current.next=pre;
            pre=current;
            current=temp;
        }

        return pre;
    }
}
