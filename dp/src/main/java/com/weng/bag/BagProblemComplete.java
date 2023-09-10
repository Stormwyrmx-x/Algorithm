package com.weng.bag;

public class BagProblemComplete
{
    public static void main(String[] args)
    {
        int [] weight=new int[]{2,3,4};
        int [] value={15,25,35};
        int bagSize=4;
        testBagProblemComplete(weight,value,bagSize);

    }

    public static void testBagProblemComplete(int[] weight, int[] value, int bagSize)
    {
        int[][]dp=new int[weight.length][bagSize+1];
        //初始化
        for (int i = 0; i <= bagSize; i++)
        {
            int count=i/weight[0];
            dp[0][i]=value[0]*count;
        }

        //遍历，先物品再背包
        for (int i = 1; i < weight.length; i++)
        {
            for (int j = 1; j <=bagSize ; j++)
            {
                if (j>=weight[i])
                {
                    dp[i][j]=Math.max(dp[i-1][j],(dp[i][j-weight[i]]+value[i]));
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        //打印
        for (int i = 0; i < weight.length; i++)
        {
            for (int j = 0; j <= bagSize; j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

//        System.out.println(dp[weight.length-1][bagSize]);
    }
}
