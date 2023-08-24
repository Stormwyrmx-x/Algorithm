package com.weng.test;

import com.weng.demo.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        while (true)
        {
            System.out.println("please enter a number");
            String line = in.nextLine();
            int num = Integer.parseInt(line);
            if (num>100||num<1)
            {
                System.out.println("invalid num,please enter again");
                continue;
            }
            list.add(num);
            int sum=getSum(list);
            if (sum>=200)
            {
                System.out.println("success!");
                break;
            }

        }

        System.out.print("you entered:");
        System.out.println(list);


    }

    private static int getSum(ArrayList<Integer> list)
    {
        int sum=0;
        for (int i = 0; i < list.size(); i++)
        {
            sum+=list.get(i);
        }
        return sum;
    }


}
