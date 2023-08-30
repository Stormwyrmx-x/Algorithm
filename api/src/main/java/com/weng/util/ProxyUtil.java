package com.weng.util;

import com.weng.entity.BigStar;
import com.weng.service.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Objects;

public class ProxyUtil
{
    public static Star createProxy(Star bigStar)
    {
        Star star = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler()
        {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
            {
                if (Objects.equals("sing", method.getName()))
                {
                    System.out.println("准备唱歌");
                } else if (method.getName().equals("dance"))
                {
                    System.out.println("准备跳舞");
                }
                else if (method.getName().equals("rap"))
                {
                    System.out.println("准备rap");
                }
                return method.invoke(bigStar, args);
            }
        });
        return star;
    }
}
