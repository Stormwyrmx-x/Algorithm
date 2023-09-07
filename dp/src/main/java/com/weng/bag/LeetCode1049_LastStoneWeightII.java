package com.weng.bag;

public class LeetCode1049_LastStoneWeightII
{
    //如果有两大块重量基本一样的石头，那么互撞后得到的重量就最小
    public static int lastStoneWeightII(int[] stones) /*这里stones的重量和价值相等*/{
        int sum=0;
        for (int num : stones)
        {
            sum += num;
        }
        int target=sum/2;
        //容量为target的背包能装的最大重量
        int[][]dp=new int[stones.length][target+1];

        //初始化
        for (int i = stones[0]; i <=target; i++)
        {
            dp[0][i]=stones[0];
        }

        //遍历
        for (int i = 1; i < stones.length; i++)
        {
            for (int j = 1; j <= target; j++)
            {
                if (j>=stones[i])
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-stones[i]]+stones[i]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return sum-2*dp[stones.length-1][target];
    }

    public static void main(String[] args)
    {

        lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1});
    }

}
