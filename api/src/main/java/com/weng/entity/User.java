package com.weng.entity;

import com.weng.anno.MyAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MyAnnotation(name = {"husiqi"})
public class User implements Cloneable
{
    @MyAnnotation(name = {"husiqi","yangsihui"})
    private Integer id;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

//    @Override
//    public String toString()
//    {
//        return "fuck";
//    }


}
