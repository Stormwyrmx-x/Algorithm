package com.weng;

public class LeetCode19_RemoveNthFromEnd
{
    //双指针法
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //虚拟头结点，因为头结点也可能会被搞掉
        ListNode dummyHead=new ListNode();
        dummyHead.next=head;

        ListNode slow=dummyHead;
        ListNode fast=dummyHead;
        //fast移动n+1
        for (int i = 0; i <= n; i++)
        {
            fast=fast.next;
        }
        //fast和slow一起移动size-n-1，这样就相当于从后往前数第n+1个了
        while (fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return dummyHead.next;
    }
}
