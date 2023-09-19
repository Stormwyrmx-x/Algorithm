package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode46_Permutations
{
    List<List<Integer>>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {

        backtracking(nums);
        return result;
    }
    public void backtracking(int[] nums)
    {
        if (path.size()==nums.length)
        {
            result.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (path.contains(nums[i]))
            {
                continue;
            }
            path.add(nums[i]);
            backtracking(nums);
            path.removeLast();
        }
    }
}
