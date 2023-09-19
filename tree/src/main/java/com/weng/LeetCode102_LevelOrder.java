package com.weng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode102_LevelOrder
{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        LinkedList<TreeNode>queue=new LinkedList<>();
        if (root!=null)
        {
            queue.addLast(root);
        }
        while (!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer>path=new ArrayList<>();
            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.removeFirst();
                path.add(node.val);
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
            result.add(path);
        }
        return result;
    }
}
