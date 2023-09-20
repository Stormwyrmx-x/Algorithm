package com.weng;

import java.util.List;

public class Node
{
    int val;
    List<Node>children;
    Node left;
    Node right;
    Node next;

    public Node()
    {
    }

    public Node(int val)
    {
        this.val = val;
    }

    public Node(int val, List<Node> children)
    {
        this.val = val;
        this.children = children;
    }
}
