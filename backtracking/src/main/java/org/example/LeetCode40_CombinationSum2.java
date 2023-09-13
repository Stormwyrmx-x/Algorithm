package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode40_CombinationSum2
{
    //组合+去重
    List<List<Integer>>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();

    boolean[]used;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        used=new boolean[candidates.length];
        Arrays.fill(used,false);
        backtracking(candidates,target,0,0);
        return result;
    }
    public void backtracking(int[] candidates, int target, int sum, int startIndex)
    {
        if (sum>=target)
        {
            if (sum==target  /*!result.contains(path)*/)
            {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i < candidates.length&&sum+candidates[i]<=target; i++)
        {
            if (i>=1&&candidates[i]==candidates[i-1]&& !used[i - 1])
            {
                continue;
            }

            used[i]=true;
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracking(candidates,target,sum,i+1);
            used[i]=false;
            sum-=candidates[i];
            path.removeLast();
        }
    }

}
