package com.weng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal_iteration
{
    public List<Integer> preorderTraversal(TreeNode root)
    {
        ArrayList<Integer>result=new ArrayList<>();
        LinkedList<TreeNode>stack=new LinkedList<>();
        stack.addLast(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.removeLast();
            if (node==null)
            {
                continue;
            }
            result.add(node.val);
            //先加右子节点、后加左子节点
            stack.addLast(node.right);
            stack.addLast(node.left);
        }

        return result;
    }
}
