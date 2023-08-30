package com.weng.demo;

import com.weng.entity.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public class ObjectsDemo
{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException
    {
//        User user=new User();
//        User user1=new User();
//        System.out.println(user1==user);
//        System.out.println(Objects.equals(user1, user));
//
//        Class<?> class1 = Class.forName("com.weng.entity.User");
//        System.out.println(class1);
//        Class<User> class2 = User.class;
//        System.out.println(class1.equals(class2));
//        Class class3 = user1.getClass();
//        System.out.println(class3==class2);

        //constructor
        Class userClass = Class.forName("com.weng.entity.User");
        Constructor[] constructors = userClass.getConstructors();
        Constructor[] declaredConstructors = userClass.getDeclaredConstructors();
        Constructor constructor = userClass.getConstructor(Integer.class,String.class);
        System.out.println(Arrays.toString(constructors));
        System.out.println(Arrays.toString(declaredConstructors));
        System.out.println(constructor);

        System.out.println(constructor.getModifiers());
        System.out.println(Arrays.toString(constructor.getParameterTypes()));
        Object user = constructor.newInstance(21, "胡斯琪");
        System.out.println(user);

        //field
        Field[] fields = userClass.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        Field id = userClass.getDeclaredField("id");
        System.out.println(id.getName());
        System.out.println(id.getType());
        id.setAccessible(true);
        System.out.println(id.get(user));
        id.set(user,22);
        System.out.println(user);

        //method
        Method method = userClass.getMethod("setName", String.class);
        System.out.println(Arrays.toString(method.getParameters()));
        method.invoke(user,"小琪琪");
        System.out.println(user);

    }
}
