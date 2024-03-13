package com.weng;

public class ThreadTest
{
    public static void main(String[] args)
    {
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        myThread1.start();
        myThread2.start();

        System.out.println(Thread.currentThread().getName()+"5555555555555");

    }
}
