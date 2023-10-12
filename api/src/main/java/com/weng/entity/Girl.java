package com.weng.entity;

import com.weng.exception.AgeOutOfBoundsException;
import com.weng.exception.NameFormatException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Girl implements Serializable,Comparable<Girl>
{
    private String name;
    private int age;

    public void setName(String name)
    {
        if (name.length()<3||name.length()>20)
        {
//            throw new RuntimeException();
            throw new NameFormatException("名字的长度不对");
        }
        this.name = name;
    }

    public void setAge(int age)
    {
        if (age<18||age>40)
        {
//            throw new RuntimeException();
            throw new AgeOutOfBoundsException("年龄的长度不对");
        }
        this.age = age;
    }

    //返回值:
    //负数:表示当前要添加的元素是小的，存左边
    //正数:表示当前要添加的元素是大的，存右边
    //0 :表示当前要添加的元素已经存在，舍弃
    @Override
    public int compareTo(Girl o)
    {
        return this.age-o.age;
    }
}
