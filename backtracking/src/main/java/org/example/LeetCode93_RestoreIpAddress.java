package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode93_RestoreIpAddress
{
    List<String>result=new ArrayList<>();
    LinkedList<Integer>path=new LinkedList<>();
    public List<String> restoreIpAddresses(String s) {

        backtracking(s,0);
        return result;
    }
    public void backtracking(String s, int startIndex)
    {
        if (startIndex==s.length()||path.size()==4)
        {
            if (startIndex==s.length()&&path.size()==4)
            {
                String ip = constructIp(path);
                result.add(ip);
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++)
        {
            if (isIp(s,startIndex,i))
            {
                path.add(Integer.valueOf(s.substring(startIndex,i+1)));
            }
            else
            {
                break;
            }
            backtracking(s,i+1);
            path.removeLast();
        }
    }


    public String constructIp(LinkedList<Integer> path)
    {
        StringBuilder stringBuilder=new StringBuilder();
        for (Integer i : path)
        {
            stringBuilder.append(i);
            stringBuilder.append('.');
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    public boolean isIp(String s, int startIndex, int i)
    {
        String substring = s.substring(startIndex, i + 1);
        int value= Integer.parseInt(substring);
        switch (substring.length())
        {
            case 1->{
                return true;
            }
            case 2->{
                return value >= 10 && value <= 99;
            }
            case 3->{
                return value>=100&&value<=255;
            }
            default -> {
                return false;
            }
        }
    }
}
