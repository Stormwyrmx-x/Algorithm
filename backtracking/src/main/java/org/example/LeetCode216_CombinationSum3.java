package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode216_CombinationSum3
{
    List<List<Integer>>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        backtracking(k,n,1,0);
        return result;
    }

    public void backtracking(int k, int n, int startIndex,int sum)
    {
        if (path.size()==k||sum>n)
        {
            if (/*countSum(path)*/sum==n)
            {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i <=10-(k-path.size()) ; i++)
        {
            sum+=i;
            path.add(i);
            backtracking(k,n,i+1,sum);
            sum-=i;
            path.removeLast();
        }
    }

    public int countSum(List<Integer>list)
    {
        int sum=0;
        for (Integer i : list)
        {
            sum+=i;
        }
        return sum;
    }

}
