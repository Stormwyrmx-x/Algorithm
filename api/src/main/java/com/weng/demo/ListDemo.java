package com.weng.demo;

import com.weng.entity.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo
{
    public static void main(String[] args)
    {
        ArrayList<User>list=new ArrayList<>();
        User user1=new User();
        User user2=new User(10,"weng");
        User user3=new User(11,"hu");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));

        }

        List<User> collect = list.stream().map((item) ->
        {
            return item;
        }).collect(Collectors.toList());
        System.out.println(collect);

    }
}
