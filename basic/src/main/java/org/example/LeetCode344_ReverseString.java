package org.example;

public class LeetCode344_ReverseString
{
    //原地反转字符串，双指针法
    public void reverseString(char[] s)
    {
        int left=0;
        int right=s.length-1;
        while (left<right)
        {
            char tmp=s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
    }
}
