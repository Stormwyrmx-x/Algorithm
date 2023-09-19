package com.weng.bag;

public class LeetCode518_CoinChange2
{
    public int change(int amount, int[] coins) {
        int[][]dp=new int[coins.length][amount+1];//选取前0~i个硬币，他们的和为amount，有几种方法
        //初始化
        for (int i = 1; i <= amount; i++)
        {
            if (i%coins[0]==0)
            {
                dp[0][i]=1;
            }
        }
        //只有当不选取任何硬币时，金额之和才为 0，因此只有 1 种硬币组合。
        for (int i = 0; i < coins.length; i++)
        {
            dp[i][0]=1;
        }


        //遍历
        for (int i = 1; i < coins.length; i++)
        {
            for (int j = 0; j <= amount; j++)
            {
                if (j>=coins[i])
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }




        return dp[coins.length-1][amount];
    }
}
