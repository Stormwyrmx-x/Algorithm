package org.example;

public class LeetCode326_PowerOfThree
{
    public boolean isPowerOfThree(int n) {
        if (n<=0)
        {
            return false;
        }
        while (n%3==0)
        {
            n/=3;
        }
        return n==1;

    }
}
