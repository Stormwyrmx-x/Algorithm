package com.weng.demo;

import com.weng.entity.Student;
import com.weng.entity.Teacher;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class ReflectionDemo
{
    public static void main(String[] args) throws IllegalAccessException
    {
        Student student = Student.builder().id(2020302646).name("weng").score(92.0).build();
        Teacher teacher = new Teacher("shao", new BigDecimal("10000.0"));
        save(student);
        save(teacher);
    }
    public static void save(Object o) throws IllegalAccessException
    {
        Class clazz = o.getClass();
        //得到所有信息
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields)
        {
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Object value = declaredField.get(o);
            System.out.println(name+"="+value);
        }
    }
}
