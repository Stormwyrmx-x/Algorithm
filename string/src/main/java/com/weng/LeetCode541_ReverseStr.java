package com.weng;

public class LeetCode541_ReverseStr
{
    public String reverseStr(String s, int k)
    {
        int i1 = s.indexOf(s);
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i+=2*k)
        {
            if (i+k<s.length())
            {
                reverseString(charArray,i,i+k-1);
            }
            reverseString(charArray,i,s.length()-1);
        }
        return new String(charArray);
    }
    public void reverseString(char[] s,int begin,int end)
    {
        for (int i = begin,j=end; i < j; i++,j--)
        {
            swap(s,i,j);
        }
    }
    public void swap(char[] s,int i,int j)
    {
        char tmp=s[i];
        s[i]=s[j];
        s[j]=tmp;
    }
}
