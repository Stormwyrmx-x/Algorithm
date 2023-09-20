package com.weng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversal_iteration2
{
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer>result=new ArrayList<>();
       LinkedList<TreeNode>stack=new LinkedList<>();
       if (root==null)
       {
           return result;
       }
       TreeNode current=root;
       while (!stack.isEmpty()||current!=null)
       {
           if (current!=null)
           {
               stack.addLast(current);
               current=current.left;
           }
           else
           {
               current = stack.removeLast();
               result.add(current.val);
               current=current.right;
           }
       }
       return result;
    }
}
