package com.weng.demo;

import com.google.gson.Gson;
import com.weng.entity.User;

public class ObjectDemo
{
    public static void main(String[] args) throws CloneNotSupportedException
    {

        Object o = new Object();
//        ArrayList<Integer>arrayList = new ArrayList<>();
////        o=arrayList;
////        arrayList=(ArrayList<Integer>) o;
//        //
//
//        Objects objects = null;
//
//        System.out.println(arrayList.toString());
        Gson gson=new Gson();
        User user1=new User(1,"weng");
        User user2;
        user2= (User) user1.clone();
        System.out.println(user2);
        User user3;
        String s = gson.toJson(user1);
        user3 = gson.fromJson(s, User.class);
        System.out.println(user3);


    }
}
