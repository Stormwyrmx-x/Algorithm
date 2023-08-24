package org.example.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class IteratorDemo
{
    public static void main(String[] args)
    {
        Collection<String> arrayList=new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            String next = iterator.next();
            if (next.equals("bbb") )
            {
                iterator.remove();
            }
//            if (next.equals("bbb") )
//            {
//                iterator.remove();
//            }
            System.out.println(next);
        }
        System.out.println(arrayList);

        String a="aaa";
        String b="aa1";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
