package com.weng.bag;

public class BagProblem01WithLinearArray
{
    public static void main(String[] args)
    {
        int[]weight={1,3,4};
        int[]value={10,15,20};
        int bagSize=4;
        testBagProblem01WithLinearArray(weight,value,bagSize);
    }

    public static void testBagProblem01WithLinearArray(int[] weight, int[] value, int bagSize)
    {
        int[]dp=new int[bagSize+1];
        //先遍历物品再倒序遍历背包
        for (int i = 0; i < weight.length; i++)
        {
            for (int j = bagSize; j >= weight[i]; j--)
            {
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }

        //打印结果
        for (int i = 0; i <= bagSize; i++)
        {
            System.out.println(i+"="+dp[i]);
        }
    }
}
