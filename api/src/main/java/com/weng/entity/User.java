package com.weng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Cloneable
{
    private Integer id;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
