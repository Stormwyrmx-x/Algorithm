package com.weng;

public class LeetCode24_SwapPairs
{
    public ListNode swapPairs(ListNode head) {
        //虚拟头结点，因为头结点也可能会被搞掉
        ListNode dummyHead=new ListNode();
        dummyHead.next=head;
        ListNode current=dummyHead;
        //一对一对交换
        while (current.next!=null&&current.next.next!=null)
        {
            ListNode temp1=current.next;
            ListNode temp2=current.next.next;
            ListNode temp3=current.next.next.next;
            current.next=temp2;
            current.next.next=temp1;
            current.next.next.next=temp3;
            current=current.next.next;
        }

        return dummyHead.next;
    }
}
