package com.weng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode199_RightSideView
{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        LinkedList<TreeNode> queue=new LinkedList<>();
        if (root!=null)
        {
            queue.addLast(root);
        }
        while (!queue.isEmpty())
        {
            int size = queue.size();
//            List<Integer>path=new ArrayList<>();
            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.removeFirst();
//                path.add(node.val);
                if (i==size-1)
                {
                    result.add(node.val);
                }
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
//            result.add(path);
//            result.add(path.get(path.size()-1));
        }

        return result;
    }
}
