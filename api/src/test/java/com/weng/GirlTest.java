package com.weng;

import com.weng.entity.Girl;
import org.junit.Test;

public class GirlTest
{
    @Test
    public void testReference()
    {
        Girl girl1=new Girl("girl1",20);
        Girl girl2=new Girl("girl2",21);
        Girl girl3=girl1;
        girl1=girl2;
        System.out.println(girl1);
        System.out.println(girl2);
        System.out.println(girl3);
    }

    @Test
    public void test2()
    {
        Girl girl=new Girl("husiqi",21);
        Girl girl1=girl;
        girl.setName("houchengcheng");
        System.out.println(girl1);
        girl1.setName("yangsihui");
        System.out.println(girl1);
        System.out.println(girl);
    }
}
