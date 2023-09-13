package com.weng;

import com.weng.entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuotationTest
{
    @Test
    public void test1()
    {
        List<User> list=new ArrayList<>();
        User user=new User(1,"husiqi");
        list.add(user);
        System.out.println(list);
        user.setName("hu");
        System.out.println(list);
    }
}
