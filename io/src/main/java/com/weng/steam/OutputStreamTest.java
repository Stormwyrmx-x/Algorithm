package com.weng.steam;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest
{
    static int fuck;
    public static void main(String[] args) throws IOException
    {
//        System.out.println(fuck);
//        System.out.println(Arrays.toString("\n".getBytes()));
//        File file=new File("c.txt");
//        file.createNewFile();
//        file.mkdirs();
        FileOutputStream fileOutputStream=new FileOutputStream("a.txt",true);
        byte[]bytes={97, 98, 99, 100};
        fileOutputStream.write(bytes,1,1);
        fileOutputStream.write("\n".getBytes());
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
