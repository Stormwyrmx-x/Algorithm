package com.weng;

import java.util.HashMap;

public class LeetCode383_RansomNote
{
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hashMap=new HashMap<>();
        //记录magazine里的字母及其出现顺序
        char[] charArray = magazine.toCharArray();
        for (char c : charArray)
        {
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        //和ransomNote中对比
        for (int i = 0; i < ransomNote.length(); i++)
        {
            if (hashMap.containsKey(ransomNote.charAt(i)))
            {
                hashMap.put(ransomNote.charAt(i),hashMap.get(ransomNote.charAt(i))-1);
                if (hashMap.get(ransomNote.charAt(i))<0)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
