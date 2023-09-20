package com.weng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode590_PostOrderN
{
    //迭代实现
    public List<Integer> postorder(Node root) {
        List<Integer>result=new ArrayList<>();
        LinkedList<Node>stack=new LinkedList<>();
        if (root==null)
        {
            return result;
        }
        stack.addLast(root);
        while (!stack.isEmpty())
        {
            Node node = stack.removeLast();
            result.add(node.val);
            for (Node child : node.children)
            {
                if (child!=null)
                {
                    stack.addLast(child);
                }
            }
        }
        Collections.reverse(result);
        return result;
    }
}
