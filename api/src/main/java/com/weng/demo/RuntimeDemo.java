package com.weng.demo;

import java.io.IOException;

public class RuntimeDemo
{
    public static void main(String[] args) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/Math.pow(1024,2));
        System.out.println(Runtime.getRuntime().freeMemory()/Math.pow(1024,2));
        System.out.println(Runtime.getRuntime().totalMemory()/Math.pow(1024,2));
//        runtime.exec("shutdown -a");


    }
}
