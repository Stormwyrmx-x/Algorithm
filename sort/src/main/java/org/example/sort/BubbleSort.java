package org.example.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr ={2,4,5,3,1,8,0};

        int []test=new int [100000];
        Random random=new Random();
        for (int i = 0; i < test.length; i++)
        {
            test[i]=random.nextInt();
        }
        long startTime = System.currentTimeMillis();
        bubbleSort(test);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }

    private static void bubbleSort(int[] arr)
    {
        int temp;
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

}
