package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode77_Combination
{
    static List<List<Integer>> result=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();

    public static List<List<Integer>> combine(int n, int k) {
        int startIndex=1;
        backtracking(n,k,startIndex);
        return result;
    }

    public static void backtracking(int n, int k, int startIndex)
    {
        if (path.size()==k)
        {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i=startIndex;i<=n-(k-path.size())+1;i++)
        {
            path.addFirst(i);
            backtracking(n,k,i+1);
            path.removeLast();
        }
    }

    public static void main(String[] args)
    {
        combine(4,2);
        System.out.println(result);
    }

}
