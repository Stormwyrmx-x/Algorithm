package org.example;

public class LeetCode191_NumberOf1Bits
{
    //使用位运算
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count=0;
        for (int i = 0; i < 32; i++)
        {
            if ((n&1)==1)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args)
    {
//        hammingWeight(1001);
        int n=(-10)%3;
        long s=10;
        n= (int) s;
        System.out.println(n);


    }

}
