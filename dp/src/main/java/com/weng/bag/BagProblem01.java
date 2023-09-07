package com.weng.bag;

public class BagProblem01
{
    public static void main(String[] args)
    {
        int [] weight=new int[]{1,3,4};
        int [] value={15,20,30};
        int bagSize=4;
        testBagProblem01(weight,value,bagSize);

    }

    public static void testBagProblem01(int[] weight, int[] value, int bagSize)
    {
        int[][]dp=new int[weight.length][bagSize+1];
        //初始化
        for (int i = weight[0]; i <= bagSize; i++)
        {
            dp[0][i]=value[0];
        }
        //遍历，先物品再背包
        for (int i = 1; i < weight.length; i++)
        {
            for (int j = 1; j <=bagSize ; j++)
            {
                if (weight[i]<=j)
                {
                    dp[i][j]=Math.max(dp[i-1][j],(dp[i-1][j-weight[i]]+value[i]));
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        //打印
        System.out.println(dp[weight.length-1][bagSize]);
    }

}
