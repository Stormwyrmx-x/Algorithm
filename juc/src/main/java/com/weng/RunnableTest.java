package com.weng;

public class RunnableTest
{
    public static void main(String[] args)
    {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread1=new Thread(myRunnable);
        Thread thread2=new Thread(myRunnable);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}
