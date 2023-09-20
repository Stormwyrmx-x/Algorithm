package com.weng;

import java.util.ArrayList;
import java.util.List;

public class LeetCode589_PreOrderN
{
    //递归实现
    public List<Integer> preorder(Node root) {
        List<Integer>result=new ArrayList<>();
        backtracking(root,result);
        return result;
    }
    public void backtracking(Node node, List<Integer> result)
    {
        if (node==null)
        {
            return;
        }
        result.add(node.val);
        for (Node child : node.children)
        {
            backtracking(child,result);
        }
    }

}
