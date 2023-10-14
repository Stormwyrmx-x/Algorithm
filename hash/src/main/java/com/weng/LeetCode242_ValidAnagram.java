package com.weng;

import com.weng.entity.Girl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode242_ValidAnagram
{
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hashMap1=new HashMap<>();
        HashMap<Character,Integer>hashMap2=new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (hashMap1.containsKey(c))
            {
                hashMap1.put(c,hashMap1.get(c)+1);
            }
            else
            {
                hashMap1.put(c,1);
            }
        }
        for (int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            if (hashMap2.containsKey(c))
            {
                hashMap2.put(c,hashMap2.get(c)+1);
            }
            else
            {
                hashMap2.put(c,1);
            }
        }
        return hashMap1.equals(hashMap2);
    }
    //法二:需要把字符映射到数组也就是哈希表的索引下标上，因为字符a到字符z的ASCII是26个连续的数值，所以字符a映射为下标0，相应的字符z映射为下标25
    public boolean isAnagram_Method2(String s, String t) {
        char[]chars=new char[26];
        for (int i = 0; i < s.length(); i++)
        {
            chars[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++)
        {
            chars[t.charAt(i)-'a']--;
        }

        for (char c : chars)
        {
            if (c!=0)
            {
                return false;
            }
        }

        return true;
    }

}
