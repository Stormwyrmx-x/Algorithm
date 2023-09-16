package com.weng;

import org.junit.Test;

import java.util.Arrays;

public class StringTest
{
    @Test
    public void simpleTest()
    {
        String s="abcdefg";
        System.out.println(s.charAt(0));
        StringBuilder stringBuilder=new StringBuilder();
        System.out.println(stringBuilder.length());
        char []chars=new char[]{97,98};
        for (char c : chars)
        {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(chars));

        byte[]bytes=new byte[]{97,98};
        for (byte b : bytes)
        {
            System.out.println(b);
        }
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes,0,1));
    }
}
