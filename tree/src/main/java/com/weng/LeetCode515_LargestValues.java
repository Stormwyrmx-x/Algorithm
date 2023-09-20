package com.weng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode515_LargestValues
{
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        LinkedList<TreeNode>queue=new LinkedList<>();
        if (root==null)
        {
            return result;
        }
        queue.addLast(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.removeFirst();
                max=Math.max(max,node.val);
                if (node.left!=null)
                {
                    queue.addLast(node.left);
                }
                if (node.right!=null)
                {
                    queue.addLast(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
