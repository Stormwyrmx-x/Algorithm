package com.weng;

import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        String s="abcd";
        char[] charArray = s.toCharArray();
        charArray[0]='x';
        System.out.println(s);
        System.out.println(charArray);

        int[]array={1,2};
        System.out.println(Arrays.toString(array));
    }
}
