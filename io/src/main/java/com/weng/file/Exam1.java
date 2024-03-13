package com.weng.file;

import java.io.IOException;

public class Exam1
{

    public static void main(String[] args) throws IOException
    {
//        File file=new File("bbb");
//        file.mkdirs();
//        file=new File(file,"a.txt");
//        file.createNewFile();
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("当前目录：" + currentDirectory);

    }

}
