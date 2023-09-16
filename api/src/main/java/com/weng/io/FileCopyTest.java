package com.weng.io;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopyTest
{
    public static void main(String[] args) throws IOException
    {
//        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\24431\\Pictures\\Saved Pictures\\31bdc1f7562964d6.png");
//        FileOutputStream fileOutputStream=new FileOutputStream("./girl.png");
//        int b;
//        long currentTimeMillis = System.currentTimeMillis();
//        while((b=fileInputStream.read())!=-1)
//        {
//            fileOutputStream.write(b);
//        }
//        long currentTimeMillis1 = System.currentTimeMillis();
//        System.out.println("拷贝文件花费了:"+(currentTimeMillis1-currentTimeMillis)+"毫秒");
//        fileOutputStream.close();
//        fileInputStream.close();

        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\24431\\Pictures\\Camera Roll\\WIN_20230713_12_34_59_Pro.mp4");
        FileOutputStream fileOutputStream=new FileOutputStream("fuck.mp4");
        byte[]bytes=new byte[1024*1024*5];
        int len;
        long start = System.currentTimeMillis();
        while ((len=fileInputStream.read(bytes))!=-1)
        {
            fileOutputStream.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("总共花了："+(end-start)+"毫秒");
        fileOutputStream.close();
        fileInputStream.close();

    }
}
