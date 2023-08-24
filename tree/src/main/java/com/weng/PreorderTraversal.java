package com.weng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class PreorderTraversal
{
    public static class Node
    {
        Integer value;
        Node left;
        Node right;

        public Node(Integer value, Node left, Node right)
        {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(Integer value)
        {
            this.value = value;
        }

        public Node()
        {
        }
    }
    public static void main(String[] args)
    {
        Node binaryTree= new Node(1, new Node(2, new Node(5), null), new Node(3, null, null));
        ArrayList<Integer>arrayList=new ArrayList<>();
        preorder(binaryTree,arrayList);
        System.out.println(arrayList.toString());
    }
    public static void preorder(Node binaryTree, ArrayList<Integer> arrayList)
    {
        if (binaryTree==null)
        {
            return;
        }
        arrayList.add(binaryTree.value);
        preorder(binaryTree.left,arrayList);
        preorder(binaryTree.right,arrayList);

    }
}
