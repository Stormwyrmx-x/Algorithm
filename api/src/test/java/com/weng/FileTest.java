package com.weng;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileTest
{
    @Test
    public void exam1() throws IOException
    {
        File file=new File("bbb");
        file.mkdirs();
        file=new File(file,"a.txt");
        file.createNewFile();
    }
    @Test
    public void exam2()
    {
        File file=new File("D:\\编程\\Algorithm\\api\\aaa");
        System.out.println(file.exists());
        File[] files = file.listFiles(pathname -> pathname.isFile()&&pathname.getName().endsWith(".avi"));
        System.out.println(Arrays.toString(files));
    }
    @Test
    public void exam3()
    {
        File file = new File("E:\\BaiduNetdiskDownload");
        checkAVI(file);
    }

    public void checkAVI(File file)
    {
        File[] files = file.listFiles();
        if (files==null)//如果权限不能访问
        {
            return;
        }
        for (File listFile : files)
        {
            if (listFile.isFile())
            {
                if (listFile.getName().endsWith(".avi"))
                {
                    System.out.println(listFile.getName());
                }
            }
            else
            {
                checkAVI(listFile);
            }
        }
    }

    @Test
    public void exam4()
    {
        File file=new File("aaa");
        deleteFile(file);
    }

    public void deleteFile(File file)
    {
        for (File listFile : file.listFiles())
        {
            if (listFile.isFile())
            {
               listFile.delete();
            }
            else
            {
                deleteFile(listFile);
            }
        }
        file.delete();
    }
    @Test
    public void exam5()
    {
        File src=new File("aaa");
        countSize(src);
        System.out.println(size);
    }

    private static long size;
    public void countSize(File src)
    {
        for (File file : src.listFiles())
        {
            if (file.isFile())
            {
                size+=file.length();
            }
            else
            {
                countSize(file);
            }
        }
    }

    Map<String,Integer>map=new HashMap<>();
    @Test
    public void exam6()
    {
        File src=new File("aaa");
        countNum(src);
        map.forEach((s, integer) -> System.out.println(s+"="+integer));
    }

    public void countNum(File src)
    {
        for (File file : src.listFiles())
        {
            if (file.isFile())
            {
                String fileName = file.getName();
                String[] split = fileName.split("\\.");
                if (split.length>=2)
                {
                    String endName = split[split.length - 1];
                    if (map.containsKey(endName))
                    {
                        map.put(endName,map.get(endName)+1);
                    }
                    else
                    {
                        map.put(endName,1);
                    }
                }
            }
            else
            {
                countNum(file);
            }
        }

    }

}
