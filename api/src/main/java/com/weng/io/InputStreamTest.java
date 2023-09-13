package com.weng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("a.txt");
        int i = fileInputStream.read();
        System.out.println(i);

    }
}
