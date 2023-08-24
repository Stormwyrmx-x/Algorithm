package com.weng.demo;

import com.weng.entity.User;

import java.util.Objects;

public class ObjectsDemo
{
    public static void main(String[] args)
    {
        User user=new User();
        User user1=new User();
        System.out.println(Objects.equals(user1, user));
    }
}
