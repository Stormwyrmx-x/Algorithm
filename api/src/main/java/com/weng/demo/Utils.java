package com.weng.demo;

import java.util.ArrayList;

public class Utils
{
    //判断是否是质数
    public static boolean isPrime(int number)
    {
        //判断是否是质数，只需判断是否能被小于平方根的数整除
        for (int i=2;i<=Math.sqrt(number);i++)
        {
            if (number%i==0)
            {
                return false;
            }
        }
        return true;
    }

    //求figure位数有多少个自幂数
    public static int NarcissisticNumber(int figure)
    {
        int count=0;
        ArrayList<Integer>number=new ArrayList<>();
        double sum=0;

        for (int i = (int)Math.pow(10,figure-1); i < Math.pow(10,figure); i++)
        {
            number.clear();
            sum=0;
            for (int j=1;j<=figure;j++)
            {
                //各个位数加到数组中
                number.add(i/(int)Math.pow(10,j-1)%10);
            }
            for (int j = 1; j <=figure ; j++)
            {
                //求和
                sum+=Math.pow(number.get(j-1),figure);
            }
            if (sum==i)
            {
                count++;
            }
        }
        return count;
    }

}
