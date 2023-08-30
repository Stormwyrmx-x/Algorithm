package com.weng.test;

import com.weng.anno.MyAnnotation;
import com.weng.demo.AnnotationDemo;
import com.weng.inner.Outer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;

public class InnerClassTest
{
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException
    {
//        Outer.Inner inner=new Outer().new Inner("asd");
//        inner.getName();

        int i = 10 | 200;
        System.out.println(i);

        AnnotationDemo annotationDemo=new AnnotationDemo();
        Class clazz = Class.forName("com.weng.demo.AnnotationDemo");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods)
        {
            declaredMethod.setAccessible(true);
            if (declaredMethod.isAnnotationPresent(MyAnnotation.class))
            {
                declaredMethod.invoke(annotationDemo);
            }
        }

    }
}
