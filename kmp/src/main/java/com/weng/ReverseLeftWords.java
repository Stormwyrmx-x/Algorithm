package com.weng;

public class ReverseLeftWords
{
    public String reverseLeftWords(String s, int n)
    {
        String substring = s.substring(0, n);
        return s.substring(n)+substring;
    }
}
