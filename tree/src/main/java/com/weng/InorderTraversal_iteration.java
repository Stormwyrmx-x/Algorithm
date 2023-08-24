package com.weng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
public class InorderTraversal_iteration
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        ArrayList<Integer>result=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode cur=root;
        while (cur!=null||!stack.isEmpty())
        {
            if (cur!=null)
            {
                stack.push(cur);
                cur=cur.left;
            }
            else
            {
                TreeNode pop = stack.pop();
                result.add(pop.value);
                cur=pop.right;
            }
        }
        return result;
    }

}
