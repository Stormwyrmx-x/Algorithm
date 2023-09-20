package com.weng;

import java.util.Collections;

public class LeetCode226_InvertTree
{
    public TreeNode invertTree(TreeNode root) {

        backtracking(root);
        return root;
    }
    public void backtracking(TreeNode root)
    {
        if (root==null)
        {
            return;
        }
        //每一个节点的左右孩子交换一下就可以
        TreeNode left = root.left;
        root.left=root.right;
        root.right=left;

        backtracking(root.left);
        backtracking(root.right);
    }
}
