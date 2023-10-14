package com.weng;

import java.util.HashSet;

public class LeetCode202_HappyNumber
{
    public boolean isHappy(int n) {
        HashSet<Integer>hashSet=new HashSet<>();
        while (!hashSet.contains(n)&&n!=1)
        {
            hashSet.add(n);
            n = getNext(n);
        }
        return n==1;
    }

    public int getNext(int index)
    {
        int sum = 0;
        while (index!=0)
        {
            sum+= (int) Math.pow(index%10,2);
            index=index/10;
        }
        return sum;
    }
}
