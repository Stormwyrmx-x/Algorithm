package com.weng.entity;

import com.weng.exception.AgeOutOfBoundsException;
import com.weng.exception.NameFormatException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Girl
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
}
