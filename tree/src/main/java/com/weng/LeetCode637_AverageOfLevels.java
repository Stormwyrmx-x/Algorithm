package com.weng;

import java.util.*;

public class LeetCode637_AverageOfLevels
{
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>result=new ArrayList<>();
        LinkedList<TreeNode>queue=new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer>path=new ArrayList<>();
//            double levelSum = 0;
            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.removeFirst();
//                levelSum+=node.val;
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

            result.add(calAverage(path));
        }

        return result;
    }

    public double calAverage(List<Integer> path)
    {
        double sum=0;
        for (Integer i : path)
        {
            sum+=i;
        }
        return sum/path.size();
    }
}
