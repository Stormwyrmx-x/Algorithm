package com.weng;

public class LeetCode142_LinkedListCycle
{
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;//head有可能为null
        ListNode slow=head;
        //1.判断链表是否有环(这是因为fast是走两步，slow是走一步，其实相对于slow来说，fast是一个节点一个节点的靠近slow的，所以fast一定可以和slow重合)
        while (fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow)
            {
                //2.如果有环，如何找到环的入口
                //从头结点出发一个指针，从相遇节点 也出发一个指针，这两个指针每次只走一个节点， 那么当这两个指针相遇的时候就是 环形入口的节点
                //x=(n-1)(z+y)+z
                ListNode listNode1=head;
                ListNode listNode2=fast;
                while (listNode1!=listNode2)
                {
                    listNode1=listNode1.next;
                    listNode2=listNode2.next;
                }
                return listNode1;
            }
        }
        return null;
    }
}
