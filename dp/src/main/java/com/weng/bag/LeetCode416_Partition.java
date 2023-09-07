package com.weng.bag;

import java.util.Arrays;
import java.util.Collections;

public class LeetCode416_Partition
{

    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int num : nums)
        {
            sum += num;
        }
        if (sum%2==1)
        {
            return false;
        }
        sum/=2;

        int []dp=new int[sum+1];

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = sum; j >= nums[i]; j--)
            {
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }

        return dp[sum] == sum;
    }

    //二维数组版本
    public boolean canPartition_Method2(int[] nums) {
        int sum=0;
        for (int num : nums)
        {
            sum += num;
        }
        if (sum%2==1)
        {
            return false;
        }
        sum/=2;

        int[][]dp=new int[nums.length][sum+1];
        //初始化
        for (int i = nums[0]; i <=sum ; i++)
        {
            dp[0][i]=nums[0];
        }

        //遍历
        for (int i = 1; i < nums.length; i++)
        {
            for (int j = 1; j <= sum; j++)
            {
                if (nums[i]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-nums[i]]+nums[i]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[nums.length-1][sum]==sum;
    }



}
