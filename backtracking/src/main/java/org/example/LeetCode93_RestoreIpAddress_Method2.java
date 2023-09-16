package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode93_RestoreIpAddress_Method2
{
    static List<String> result=new ArrayList<>();
    public static List<String> restoreIpAddresses(String s) {
        StringBuilder stringBuilder=new StringBuilder(s);
        backtracking(stringBuilder,0,0);
        return result;
    }
    public static void backtracking(StringBuilder s, int startIndex,int pointNum)
    {
       if (pointNum==3)
       {
           if (isIp(s.toString(),startIndex,s.length()-1))
           {
               result.add(s.toString());
           }
            return;
       }
        for (int i = startIndex; i < s.length(); i++)
        {
            if (isIp(s.toString(),startIndex,i))
            {
                s.insert(i+1,".");
                pointNum++;
            }
            else
            {
                break;
            }
            backtracking(s,i+2,pointNum);
            pointNum--;
            s.deleteCharAt(i+1);
        }

    }


    public static boolean isIp(String s, int startIndex, int i)
    {
        if (startIndex>i)
        {
            return false;
        }
        String substring = s.substring(startIndex, i + 1);

        switch (substring.length())
        {
            case 1->{
                return true;
            }
            case 2->{
                int value= Integer.parseInt(substring);
                return value >= 10 && value <= 99;
            }
            case 3->{
                int value= Integer.parseInt(substring);
                return value>=100&&value<=255;
            }
            default -> {
                return false;
            }
        }
    }

    public static void main(String[] args)
    {
        restoreIpAddresses("101023");
        System.out.println(result);
    }
}
