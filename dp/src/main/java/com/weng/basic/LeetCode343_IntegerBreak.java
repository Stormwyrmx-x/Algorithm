package com.weng.basic;

public class LeetCode343_IntegerBreak
{

    public static int integerBreak(int n) {
        //法一，数学推导
//        switch (n)
//        {
//            case 2 ->
//            {
//                return 1;
//            }
//            case 3 ->
//            {
//                return 2;
//            }
//            case 4 ->
//            {
//                return 4;
//            }
//        }
//        int[]dp=new int[n+1];
//        dp[2]=1;
//        dp[3]=2;
//        dp[4]=4;
//        for (int i = 5; i <= n; i++)
//        {
//            if (i%3==1)
//            {
//                dp[i]=dp[i-1]*4/3;
//            }
//            else
//            {
//                dp[i]=dp[i-1]*3/2;
//            }
//        }
//        return dp[n];

        //法二，dp推导:dp[i] = max(dp[i], max((i - j) * j, dp[i - j] * j));
        int[]dp=new int[n+1];
        dp[2]=1;
        for (int i = 3; i <= n; i++)
        {
            for (int j = 1; j <=i/2 ; j++)
            {
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }



    public static void main(String[] args)
    {
        integerBreak(10);
    }
}
