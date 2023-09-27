package com.weng;

public class LeetCode104_MaxDepth
{
    int depth;
    int max;
    public int maxDepth(TreeNode root) {
        preorderTraversal(root);
        return max;
    }
    public void preorderTraversal(TreeNode root)
    {
        if (root==null)
        {
            return;
        }
        else
        {
            depth++;
            max=Math.max(max,depth);
        }
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        depth--;
    }

    public int postorderTraversal(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }

        int left = postorderTraversal(root.left);
        int right = postorderTraversal(root.right);
        int height=1+Math.max(left,right);
        return height;
    }
}
