package com.weng.bag;

public class LeetCode494_TargetSum
{
    //todo 不会，目标和
    //求怎么使得left=(sum+target)/2
    public static int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for (int num : nums)
        {
            sum+=num;
        }

        if ((sum+target)%2!=0||(sum+target)<0)
        {
            return 0;
        }
        int left=(sum+target)/2;
        int [][]dp=new int[nums.length][left+1]; //在nums[0~i]中选，使其相加为left。有几种选法
        //初始化
        for (int i = 0; i < nums.length; i++)
        {
            dp[i][0]=1;
        }
        for (int i = 0; i <= left; i++)
        {
            if (nums[0]==i)
            {
                dp[0][i]=1;
            }
        }

        //遍历
        for (int i = 1; i < nums.length; i++)
        {
            for (int j = 0; j <= left; j++)
            {
                if (nums[i]<=j)
                {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        //打印dp数组
        for (int i = 0; i < dp.length; i++)
        {
            for (int j = 0; j < dp[i].length; j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return dp[nums.length-1][left];


//        int []dp=new int[left+1];
//        dp[0]=1;
//
//
//        for (int i = 0; i < nums.length; i++)
//        {
//            for (int j = left; j >= nums[i]; j--)
//            {
////                dp[j]=dp[j-nums[i]]+1;
//                dp[j]+=dp[j-nums[i]];
//            }
//        }
//        return dp[left];
    }

    public static void main(String[] args)
    {
        findTargetSumWays(new int[]{1,2,2,1,1},3);
    }
}
