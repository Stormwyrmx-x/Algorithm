package com.weng.test;

import com.weng.inner.Outer;

public class InnerClassTest
{
    public static void main(String[] args)
    {
        Outer.Inner inner=new Outer().new Inner("asd");
        inner.getName();

    }
}
