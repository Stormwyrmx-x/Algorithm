package com.weng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode116_Connect
{
    public Node connect(Node root) {
        LinkedList<Node> queue=new LinkedList<>();
        if (root!=null)
        {
            queue.addLast(root);
        }
        while (!queue.isEmpty())
        {
            int size = queue.size();
            //在单层遍历的时候记录一下本层的头部节点，然后在遍历的时候让前一个节点指向本节点就可以了
            Node current = queue.removeFirst();
            if (current.left!=null)
            {
                queue.addLast(current.left);
            }
            if (current.right!=null)
            {
                queue.addLast(current.right);
            }
            for (int i = 1; i < size; i++)
            {
                Node node = queue.removeFirst();
                current.next=node;
                current=node;
                //先加左子节点、后加右子节点
                if (node.left!=null)
                {
                    queue.addLast(node.left);
                }
                if (node.right!=null)
                {
                    queue.addLast(node.right);
                }
            }
        }
        return root;
    }
}
