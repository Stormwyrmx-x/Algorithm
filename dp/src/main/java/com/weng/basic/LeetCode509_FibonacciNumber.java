package com.weng.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeetCode509_FibonacciNumber
{
    //动规5步曲
    public int fib(int n) {
       int[]dp=new int[n+1];
       if (n<=1)
       {
           return n;
       }
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <= n; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
