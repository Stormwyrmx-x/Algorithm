package com.weng.demo;

import com.weng.anno.MyAnnotation;

public class AnnotationDemo
{
    @MyAnnotation
    public void tietie()
    {
        System.out.println("女孩子贴贴");
    }

    @MyAnnotation
    public void tietie2()
    {
        System.out.println("我要和可爱的女孩子贴贴麻~");
    }

//    @MyAnnotation
    public void tietie3()
    {
        System.out.println("女孩子白白的，香香的，好可爱呀");
    }
}
