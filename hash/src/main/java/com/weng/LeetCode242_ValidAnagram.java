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
}
