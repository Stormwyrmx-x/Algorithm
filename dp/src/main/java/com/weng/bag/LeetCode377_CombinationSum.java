package com.weng.bag;

public class LeetCode377_CombinationSum
{
    //todo 排列
    public int combinationSum4(int[] nums, int target) {
        int [][]dp=new int[nums.length][target+1];
        //初始化
        for (int i = 0; i < nums.length; i++)
        {
            dp[i][0]=1;
        }
        for (int i = 1; i <= target; i++)
        {
            if (i%nums[0]==0)
            {
                dp[0][i]=1;
            }
        }
        //遍历
        for (int j = 1; j <= target; j++)
        {
            for (int i = 1; i < nums.length; i++)
            {
                if (j>=nums[i])
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-nums[i]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[nums.length-1][target];
    }

}
