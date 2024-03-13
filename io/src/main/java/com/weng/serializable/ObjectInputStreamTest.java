package com.weng.serializable;

import com.weng.entity.Girl;
import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectInputStreamTest
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("a.txt"));
        Object girl = objectInputStream.readObject();
        System.out.println(girl.getClass());
        System.out.println(girl);
    }
}
