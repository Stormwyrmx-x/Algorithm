package com.weng;

import com.weng.entity.Girl;
import com.weng.entity.Student;
import com.weng.exception.AgeOutOfBoundsException;
import com.weng.exception.NameFormatException;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;

public class ExceptionTest
{
    @Test
    public void testRunTimeException()
    {
        int[] a =new int[3];
        Integer b;
        Student student=new Student();
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(a[0]);
        System.out.println(student);


    }


    @Test
    public void testTryCatch()
    {
        int []a={1,2,3,4,5};


        try
        {
            throw new ArrayIndexOutOfBoundsException();
//            System.out.println(a[10]);
//            System.out.println(2/0);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("array index out of bounds!");
        }catch (ArithmeticException arithmeticException)
        {
            System.out.println("算术异常！");
        }

        System.out.println("finish!~~~~");
    }


    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Girl girl=new Girl();
        while (true)
        {
            try
            {
                System.out.println("请输入名字");
                String name=in.nextLine();
                girl.setName(name);

                System.out.println("请输入年龄");
                int age = Integer.parseInt(in.nextLine());
                girl.setAge(age);
                break;

            } catch (AgeOutOfBoundsException | NameFormatException | NumberFormatException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println(girl);
    }

}
