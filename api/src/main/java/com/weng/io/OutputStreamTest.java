package com.weng.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest
{
    public static void main(String[] args) throws IOException
    {
//        File file=new File("c.txt");
//        file.createNewFile();
//        file.mkdirs();
        FileOutputStream fileOutputStream=new FileOutputStream("b.txt");
        fileOutputStream.write(98);
        fileOutputStream.close();
    }
}
