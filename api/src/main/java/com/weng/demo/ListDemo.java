package com.weng.demo;

import com.weng.entity.User;

import java.util.*;
import java.util.stream.Collectors;

public class ListDemo
{
    public static void main(String[] args)
    {
//        ArrayList<User>list=new ArrayList<>();
//        User user1=new User();
//        User user2=new User(10,"weng");
//        User user3=new User(11,"hu");
//        list.add(user1);
//        list.add(user2);
//        list.add(user3);
//        list.add(user2);
//        list.add(user2);
//        list.add(user2);
//        for (int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i));
//
//        }
//
//        List<User> collect = list.stream().map((item) ->
//        {
//            return item;
//        }).collect(Collectors.toList());
//        System.out.println(collect);
        List<List<Integer>> result=new ArrayList<>();
        LinkedList<Integer> path=new LinkedList<>();
//        result.add(Arrays.asList(1,2));
//        System.out.println(result);
//        result.add(Arrays.asList(1,2,3));
//        System.out.println(result);
        path.add(1);
        result.add(path);
        System.out.println(result);
        path.add(2);
        result.add(path);
        System.out.println(result);
    }
}
