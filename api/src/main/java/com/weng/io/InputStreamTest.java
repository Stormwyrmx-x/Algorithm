package com.weng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamTest
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("a.txt");
        int b;
        while((b=fileInputStream.read())!=-1)
        {
            System.out.println(b);
        }
        int i = fileInputStream.read();
        System.out.println(i);
//        FileInputStream fileInputStream=new FileInputStream("a.txt");
//        byte[]bytes=new byte[2];
//        int length = fileInputStream.read(bytes);
//        System.out.println(length);
//        System.out.println(new String(bytes));
//        length=fileInputStream.read(bytes);
//        System.out.println(length);
//        System.out.println(new String(bytes));
//        length=fileInputStream.read(bytes);
//        System.out.println(length);
//        System.out.println(new String(bytes,0,2));
    }
}
