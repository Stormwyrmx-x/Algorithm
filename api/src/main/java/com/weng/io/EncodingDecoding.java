package com.weng.io;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EncodingDecoding
{
    public static void main(String[] args) throws IOException
    {
        String s="abc女孩子";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        String s1 = new String(bytes);
        System.out.println(s1);

        String b="喜欢你!";
        byte[] bytes1 = b.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));
        System.out.println(new String(bytes1,"GBK"));

    }
}
