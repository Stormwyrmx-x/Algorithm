package com.weng;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(this.getName()+"hello world");
            System.out.println(Thread.currentThread().getName()+"5555555555555");
        }
    }
}
