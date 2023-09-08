package com.weng.bag;

public class LeetCode474_FindMaxForm
{
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][]dp=new int[m+1][n+1][strs.length];//放最多m个0，n个1，前0~i个中的最长子集的长度
        //初始化
        for (int i = getZeroNum(strs[0]); i <= m; i++)
        {
            for (int j = strs[0].length()-getZeroNum(strs[0]); j <= n; j++)
            {
                dp[i][j][0]=1;
            }
        }

        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                for (int k = 1; k < strs.length; k++)
                {
                    int zeroNum = getZeroNum(strs[k]);
                    int oneNum=strs[k].length()-zeroNum;
                    if (zeroNum<=i&&oneNum<=j)
                    {
                        dp[i][j][k]=Math.max(dp[i][j][k-1],dp[i-zeroNum][j-oneNum][k-1]+1);
                    }
                    else
                    {
                        dp[i][j][k]=dp[i][j][k-1];
                    }
                }
            }
        }

        return dp[m][n][strs.length-1];
    }

    public int getZeroNum(String str)
    {
        int count=0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)=='0')
            {
                count++;
            }
        }
        return count;
    }
}
