package com.weng;

public class Interview0207_IntersectionOfTwoLinkedLists
{
    //法一：两层for循环，暴力搜索
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
        {
            return null;
        }
        ListNode currentA=headA;
        ListNode currentB=headB;
        while (currentA!=null)
        {
            currentB=headB;
            while (currentB!=null)
            {
                if (currentA==currentB)
                {
                    return currentA;
                }
                currentB=currentB.next;
            }
            currentA=currentA.next;
        }
        return null;
    }
    //法二：拉到一样长，然后比较
    public ListNode getIntersectionNode_Method2(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
        {
            return null;
        }
        ListNode currentA=headA;
        ListNode currentB=headB;
        //计算每个链表的长度
        int lenA=0,lenB=0;
        while (currentA!=null)
        {
            currentA=currentA.next;
            lenA++;
        }
        while (currentB!=null)
        {
            currentB=currentB.next;
            lenB++;
        }
        currentA=headA;
        currentB=headB;
        //将它们拉到一样长
        int gap;
        if (lenA>=lenB)
        {
            gap=lenA-lenB;
            for (int i = 0; i < gap; i++)
            {
                currentA=currentA.next;
            }
        }
        else
        {
            gap=lenB-lenA;
            for (int i = 0; i < gap; i++)
            {
                currentB=currentB.next;
            }
        }
        //开始逐一对比
        while (currentA!=null&&currentB!=null)
        {
            if (currentA==currentB)
            {
                return currentA;
            }
            currentA=currentA.next;
            currentB=currentB.next;
        }

        return null;
    }
}
