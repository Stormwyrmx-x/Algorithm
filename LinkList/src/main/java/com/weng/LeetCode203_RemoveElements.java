package com.weng;

import java.util.LinkedList;

public class LeetCode203_RemoveElements
{
    //法一：不添加虚拟头节点
    public ListNode removeElements(ListNode head, int val) {
        //删除头节点
        while (head!=null&&head.val==val)
        {
            head=head.next;
        }

        //删除非头节点
        ListNode current=head;
        while (current!=null&&current.next!=null)
        {
            if (current.next.val==val)//核心代码，不能写成current.val==val，不然不能链接
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }

        return head;
    }

    //法二：添加虚拟头节点
    public ListNode removeElements_Method2(ListNode head, int val) {
        ListNode shead=new ListNode();
        shead.next=head;
        ListNode current=shead;
        while (current!=null&&current.next!=null)
        {
            if (current.next.val==val)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }
        return shead.next;
    }
}
