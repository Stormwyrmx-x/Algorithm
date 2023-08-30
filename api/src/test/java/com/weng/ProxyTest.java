package com.weng;

import com.weng.entity.BigStar;
import com.weng.service.Star;
import com.weng.util.ProxyUtil;
import org.junit.Test;

public class ProxyTest
{
    @Test
    public void testStar()
    {
        BigStar bigStar=new BigStar("鸡哥");
        Star star = ProxyUtil.createProxy(bigStar);
        String result = star.sing("鸡你太美");
        System.out.println(result);
        star.dance();
        star.rap("这种感觉我曾未有");

    }
}
