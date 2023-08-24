package org.example.sort;

import org.example.entity.Girl;

import java.util.ArrayList;
import java.util.Collections;

public class GirlSort
{
    public static void main(String[] args)
    {
        ArrayList<Girl>girlArrayList=new ArrayList<>();
        Collections.addAll(girlArrayList,new Girl(19,1.63,"hu"),new Girl(20,1.65,"yang"),new Girl(20,1.65,"misaga"));
        Collections.sort(girlArrayList,(o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            if (temp==0)
            {
                temp=o1.getHeight()- o2.getHeight();
            }
            if (temp==0)
            {
                temp=o1.getName().compareTo(o2.getName());
            }
            if (temp>0)
            {
                return 1;
            }
            else if (temp<0)
            {
                return -1;
            }
            else {
                return 0;
            }
        });

        System.out.println(girlArrayList);

        System.out.println(girlArrayList.get(1).hashCode());
        System.out.println(girlArrayList.get(0).hashCode());


    }
}
