package com.weng.basic;

public class LeetCode63_UniquePathsWithObstacles
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;//行
        int n=obstacleGrid[0].length;//列
        int[][]dp=new int[m][n];

        //初始化第一行和第一列
        if (obstacleGrid[0][0]==0)
        {
            dp[0][0]=1;
        }
        else
        {
            return 0;
        }
        for (int i = 1; i < m&&obstacleGrid[i][0]!=1; i++)
        {
            dp[i][0]=1;
//            if (obstacleGrid[i][0]==1)
//            {
//                dp[i][0]=0;
//            }
//            else
//            {
//                dp[i][0]=dp[i-1][0];
//            }
        }
        for (int i = 1; i < n&&obstacleGrid[0][i]!=1; i++)
        {
            dp[0][i]=1;
//            if (obstacleGrid[0][i]==1)
//            {
//                dp[0][i]=0;
//            }
//            else
//            {
//                dp[0][i]=dp[0][i-1];
//            }
        }

        //递推
        for (int i = 1; i < m; i++)
        {
            for (int j = 1; j < n; j++)
            {
                if (obstacleGrid[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }
}
