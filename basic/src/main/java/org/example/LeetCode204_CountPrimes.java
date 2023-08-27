package org.example;

public class LeetCode204_CountPrimes
{
    //计算质数的个数
    //todo 埃氏筛
    public int countPrimes(int n) {
        int count = 0;
        for (int i=2;i<n;i++)
        {
            if (isPrime(i))
            {
                count++;
            }
        }
        return count;
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
