package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode131_PalindromePartition
{
    List<List<String>>result=new ArrayList<>();
    LinkedList<String>path=new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return result;
    }

    public void backtracking(String s, int startIndex)
    {
        if (startIndex==s.length())
        {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++)
        {
            if (isPalindrome(s,startIndex,i))
            {
                path.add(s.substring(startIndex,i+1));
            }
            else
            {
                continue;
            }
            backtracking(s,i+1);
            path.removeLast();
        }
    }

    public boolean isPalindrome(String s, int startIndex, int i)
    {
        String substring = s.substring(startIndex,i + 1);
        StringBuilder stringBuilder=new StringBuilder(substring);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(substring);
    }
}
