package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode39_CombinationSum
{
    static List<List<Integer>>result=new ArrayList<>();
    static LinkedList<Integer>path=new LinkedList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,target,0,0);
        return result;
    }

    public static void backtracking(int[] candidates, int target, int sum ,int startIndex)
    {
        if (sum>=target)
        {
            if (sum==target)
            {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i < candidates.length&&sum+candidates[i]<=target; i++)
        {
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracking(candidates,target,sum,i);
            sum-=candidates[i];
            path.removeLast();
        }
    }

    public static void main(String[] args)
    {
        int[]candidates={2,3,6,7};
        combinationSum(candidates,7);
        System.out.println(result);
    }
}
