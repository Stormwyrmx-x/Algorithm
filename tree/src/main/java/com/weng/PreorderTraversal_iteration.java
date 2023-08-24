package com.weng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal_iteration
{
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
//        if (root==null)
//        {
//            return result;
//        }
        stack.push(root);

        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            if (node!=null)
            {
                result.add(node.value);
            }
            else
            {
                continue;
            }
            stack.push(node.left);
            stack.push(node.right);
        }

        return result;
    }
}
