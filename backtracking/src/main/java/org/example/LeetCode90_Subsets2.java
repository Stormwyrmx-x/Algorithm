package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode90_Subsets2
{
    List<List<Integer>>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();
    boolean[]used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        used=new boolean[nums.length];
        Arrays.sort(nums);
        Arrays.fill(used,false);
        backtracking(nums,0);
        return result;
    }
    public void backtracking(int[] nums, int startIndex)
    {
        result.add(new ArrayList<>(path));
        if (startIndex>=nums.length)
        {
            return;
        }
        for (int i = startIndex; i < nums.length; i++)
        {
            if (i>=1&&nums[i]==nums[i-1]&& !used[i - 1])
            {
                continue;
            }
            used[i]=true;
            path.add(nums[i]);
            backtracking(nums,i+1);
            used[i]=false;
            path.removeLast();
        }
    }
}
