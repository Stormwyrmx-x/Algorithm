package com.weng;

public class LeetCode101_SymmetricBinaryTree_Method2
{
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode left,TreeNode right)
    {
        if (left==null&&right==null)
        {
            return true;
        }
        else if (left==null&&right!=null)
        {
            return false;
        }
        else if (left!=null&&right==null)
        {
            return false;
        }
        else if (left.val!=right.val)
        {
            return false;
        }
        //判断外侧子树
        boolean outside = compare(left.left, right.right);
        //判断内测子树
        boolean inside = compare(left.right, right.left);

        return outside&&inside;
    }
}
