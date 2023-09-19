package com.weng;

import java.util.*;

public class PostorderTraversal_iteration
{
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        LinkedList<TreeNode>stack=new LinkedList<>();
        stack.addLast(root);

        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            if (node==null)
            {
                continue;
            }
            result.add(node.val);
            //
            stack.push(node.left);
            stack.push(node.right);
        }

        Collections.reverse(result);
        return result;
    }
}
