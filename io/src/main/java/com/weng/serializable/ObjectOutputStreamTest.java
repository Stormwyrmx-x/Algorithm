package com.weng.serializable;

import com.weng.entity.Girl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class ObjectOutputStreamTest
{
    public static void main(String[] args) throws IOException
    {
        Girl girl1=new Girl("小红",18);
        Girl girl2=new Girl("小胡",18);
        Girl girl3=new Girl("小丽",18);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("a.txt"));
        List<Girl>girlList=new ArrayList<>(Arrays.asList(girl1,girl2,girl3));
        objectOutputStream.writeObject(girlList);
        objectOutputStream.close();
    }
}
