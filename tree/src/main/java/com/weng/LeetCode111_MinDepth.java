package com.weng;

import java.util.LinkedList;

public class LeetCode111_MinDepth
{
    //层序遍历
    public int minDepth(TreeNode root) {
        LinkedList<TreeNode>queue=new LinkedList<>();
        if (root==null)
        {
            return 0;
        }
        queue.addLast(root);
        int depth=0;
        while (!queue.isEmpty())
        {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.removeFirst();
                if (node.left==null&&node.right==null)
                {
                    return depth;
                }
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
        return depth;
    }
}
