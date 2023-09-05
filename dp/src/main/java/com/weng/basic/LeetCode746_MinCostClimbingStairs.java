package com.weng.basic;

public class LeetCode746_MinCostClimbingStairs
{
    //动规5部曲
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length];//dp[i]表示从i级台阶开始到爬到楼顶所需要的最小花费
        dp[cost.length-1]=cost[cost.length-1];
        dp[cost.length-2]=cost[cost.length-2];

        for (int i = cost.length-3; i >=0; i--)
        {
            dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);

    }
    //法2：dp[i]表示到达下标 i 的最小花费。dp[i]=min(dp[i−1]+cost[i−1],dp[i−2]+cost[i−2])
}
