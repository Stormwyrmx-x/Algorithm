package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode78_Subsets
{
    List<List<Integer>>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return result;
    }

    public void backtracking(int[] nums, int startIndex)
    {
        result.add(new ArrayList<>(path));
//        if (startIndex==nums.length)
//        {
//            result.add(new ArrayList<>(path));
//            return;
//        }
        for (int i = startIndex; i < nums.length; i++)
        {
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();
        }
    }
}
