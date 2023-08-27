package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118_Generate
{
    //杨辉三角
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result=new ArrayList<>();
        for (int i = 0; i < numRows; i++)
        {
            List<Integer>row=new ArrayList<>();
            for (int j = 0; j <= i; j++)
            {
                //如果在边上，则没有上一层的result.get(i-1).get(j-1)或result.get(i-1).get(j)
                if (j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    //无法算阶乘，因为long长度有限，不够
//    public static long doFactorial(Integer num)
//    {
//        long result=1;
//        for (int i = 1; i <= num; i++)
//        {
//            result*=i;
//        }
//        return result;
//    }
//
//    public static long getCnm(Integer n,Integer m)
//    {
//        long result=doFactorial(n)/doFactorial(m);
//        result=result/doFactorial(n-m);
//        return result;
//    }
//
//    public static void main(String[] args)
//    {
////        System.out.println(12/2/3);
//        System.out.println(getCnm(13, 1));
////        generate(14);
//    }
}
