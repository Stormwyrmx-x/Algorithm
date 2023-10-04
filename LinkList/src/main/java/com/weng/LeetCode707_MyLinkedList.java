package com.weng;

public class LeetCode707_MyLinkedList
{
    int size;
    ListNode dummyHead;

    public LeetCode707_MyLinkedList()
    {
        size=0;
        dummyHead=new ListNode();
    }

    public int get(int index) {
        if (index<0||index>=size)
        {
            return -1;
        }
        ListNode current=dummyHead;
        for (int i = 0; i <= index; i++)
        {
            current=current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if (index<0||index>size)
        {
            return;
        }
        ListNode current=dummyHead;
        for (int i = 0; i < index; i++)
        {
            current=current.next;
        }
        ListNode newNode=new ListNode(val);
        newNode.next=current.next;
        current.next=newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index<0||index>=size)
        {
            return;
        }
        ListNode current=dummyHead;
        for (int i = 0; i < index; i++)
        {
            current=current.next;
        }
        current.next=current.next.next;
        size--;
    }
}
