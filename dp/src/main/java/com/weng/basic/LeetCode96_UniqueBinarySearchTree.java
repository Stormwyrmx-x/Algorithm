package com.weng.basic;

public class LeetCode96_UniqueBinarySearchTree
{
    public int numTrees(int n) {
        //dp[3] = dp[2] * dp[0] + dp[1] * dp[1] + dp[0] * dp[2]
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n ; i++)
        {
            for (int j = 0; j < i; j++)
            {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
