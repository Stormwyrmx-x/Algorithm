package com.weng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal_iteration_2
{
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        LinkedList<TreeNode>stack=new LinkedList<>();
        if (root==null)
        {
            return result;
        }
        stack.addLast(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.removeLast();
            result.add(node.val);
            if (node.right!=null)
            {
                stack.addLast(node.right);
            }
            if (node.left!=null)
            {
                stack.addLast(node.left);
            }
        }
        return result;
    }
}
