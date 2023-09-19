package com.weng;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode429_NLeverOrder
{
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>result=new ArrayList<>();
        LinkedList<Node> queue=new LinkedList<>();
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
                Node node = queue.removeFirst();
                path.add(node.val);
                //加入Node的多个子节点
                if (node.children!=null)
                {
                    for (Node child : node.children)
                    {
                        if (child!=null)
                        {
                            queue.addLast(child);
                        }
                    }
                }
            }
            result.add(path);
        }
        return result;
    }
}
