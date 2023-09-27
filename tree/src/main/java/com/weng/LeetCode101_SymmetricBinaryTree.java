package com.weng;

import java.util.LinkedList;

public class LeetCode101_SymmetricBinaryTree
{
    public boolean isSymmetric(TreeNode root) {
         LinkedList<TreeNode>queue=new LinkedList<>();
         queue.add(root.left);
         queue.add(root.right);

         while (!queue.isEmpty())
         {
             TreeNode left = queue.removeFirst();
             TreeNode right = queue.removeFirst();
             if (left==null&&right==null)
             {
                continue;
             }
             else if (left==null||right==null||left.val!=right.val)
             {
                 return false;
             }
             //如果left.val==right.val
             queue.add(left.left);
             queue.add(right.right);
             queue.add(left.right);
             queue.add(right.left);
         }

        return true;
    }
}
