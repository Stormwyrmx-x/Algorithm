package com.weng;

public class LeetCode541_ReverseStr
{
    public String reverseStr(String s, int k)
    {
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k)
        {
            if (i+k<=s.length())
            {
                reverseString(array,i,i+k-1);

            }
            else
            {
                reverseString(array,i,s.length()-1);
            }

        }


        return new String(array);
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
