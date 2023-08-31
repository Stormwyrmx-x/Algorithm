package org.example;

import java.util.*;

public class LeetCode204_CountPrimes
{
    //计算质数的个数，可以构造质数表
    //埃氏筛,即厄拉多塞筛法:如果 x 是质数，那么大于 x 的 x 的倍数 2x,3x,…一定不是质数，这里直接从x*x开始标记
    public static int countPrimes(int n) {
        //0表示合数，1表示质数
        List<Integer>primeList=new ArrayList<>(Collections.nCopies(n,1));
        int count=0;
        for (int i = 2; i < n; i++)
        {
            if (primeList.get(i)==1)//i是个质数
            {
                count++;
                if ((long)i*i<n)
                {
                    for (int j = i*i; j < n; j+=i)
                    {
                        primeList.set(j,0);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        countPrimes(10);
    }
    public boolean isPrime(int num)
    {
        for (int i=2;i<=Math.sqrt(num);i++)
        {
            if (num%i==0)
            {
                return false;
            }
        }
        return true;
    }


}
