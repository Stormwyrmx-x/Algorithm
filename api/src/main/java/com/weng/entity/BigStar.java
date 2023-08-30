package com.weng.entity;

import com.weng.service.Star;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BigStar implements Star
{
    private String name;

    @Override
    public String sing(String name)
    {
        System.out.println(this.name+"在唱:"+name);
        return "你干嘛~哎呦~";
    }

    @Override
    public void dance()
    {
        System.out.println(this.name+"在跳舞");
    }

    @Override
    public void rap(String name)
    {
        System.out.println(this.name+"在rap:"+name);
    }
}
