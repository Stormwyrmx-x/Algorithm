package org.example;

public class LeetCode2427_NumberOfCommonFactors
{
    //公因子的数目
    public int commonFactors(int a, int b) {
        int min=Math.min(a,b);
        int result=1;
        for (int i=2;i<=min;i++)
        {
            if (a%i==0&&b%i==0)
            {
                result++;
            }
        }
        return result;
    }
}
