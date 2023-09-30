package com.weng;

public class LeetCode28_StrStr
{
    public int strStr(String haystack, String needle)
    {
        return haystack.indexOf(needle);
//        for (int i = 0; i < haystack.length(); i++)
//        {
//            if (haystack.startsWith(needle, i))
//            {
//                return i;
//            }
//        }
//        return -1;
    }
}
