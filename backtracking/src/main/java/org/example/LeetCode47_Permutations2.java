package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode47_Permutations2
{
    List<List<Integer>>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();

    boolean[]used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used=new boolean[nums.length];
        Arrays.fill(used,false);
        backtracking(nums);
        return result;
    }
    public void backtracking(int[] nums)
    {
        if (path.size()==nums.length)
        {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (i>=1&&nums[i]==nums[i-1]&& !used[i - 1])
            {
                continue;
            }
            if (!used[i])
            {
                used[i]=true;
                path.add(nums[i]);
                backtracking(nums);
                path.removeLast();
                used[i]=false;
            }
        }
    }
}
