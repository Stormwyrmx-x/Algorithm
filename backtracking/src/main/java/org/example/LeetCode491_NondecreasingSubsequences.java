package org.example;

import java.util.*;

public class LeetCode491_NondecreasingSubsequences
{
    List<List<Integer>>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {

        backtracking(nums,0);
        return result;
    }

    public void backtracking(int[] nums, int startIndex)
    {
        if (path.size()>=2)
        {
            result.add(new ArrayList<>(path));
//            return;
        }
        HashSet<Integer>set=new HashSet<>();
        for (int i = startIndex; i < nums.length; i++)
        {
//            HashSet<Integer>set=new HashSet<>();
            if (!path.isEmpty()&&nums[i]<path.get(path.size()-1)||set.contains(nums[i]))
            {
                continue;
            }
            set.add(nums[i]);
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();
        }
    }

}
