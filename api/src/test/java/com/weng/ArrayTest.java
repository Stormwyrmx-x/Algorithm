package com.weng;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTest
{
    @Test
    public void testFor()
    {
        int[]dp=new int[3];
        for (int i : dp)
        {
            i=10;
        }
        System.out.println(Arrays.toString(dp));
    }

}
