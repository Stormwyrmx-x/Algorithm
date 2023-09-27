package com.weng;

public class LeetCode572_SubTree
{
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null)
        {
            return false;
        }
        if (isSameTree(root,subRoot))
        {
            return true;
        }
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        return left||right;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
        {
            return true;
        }
        else if(p==null&&q!=null)
        {
            return false;
        }
        else if(p!=null&&q==null)
        {
            return false;
        }
        else if(p.val!=q.val)
        {
            return false;
        }
        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);
        return left&&right;
    }
}
