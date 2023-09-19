package com.weng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode107_LevelOrder2
{
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        LinkedList<TreeNode>queue=new LinkedList<>();
        if (root==null)
        {
            return result;
        }
        queue.addLast(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer>path=new ArrayList<>();
            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.removeFirst();
                path.add(node.val);
                if (node.left!=null)
                {
                    queue.addLast(node.left);
                }
                if (node.right!=null)
                {
                    queue.addLast(node.right);
                }
            }
            result.add(path);
        }
        Collections.reverse(result);
        return result;
    }
}
