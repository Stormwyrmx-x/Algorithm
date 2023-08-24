package org.example.sort;

import java.util.Random;

public class QuickSort
{
    public static void main(String[] args)
    {
        int []arr={15,32, 6, 22, 7, 19, 54, 4, 99, 8,40, 8};

        int []test=new int [100000];
        Random random=new Random();
        for (int i = 0; i < test.length; i++)
        {
            test[i]=random.nextInt();
        }
        long startTime = System.currentTimeMillis();
        quickSort(test,0,test.length-1);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }

    /**
     *   参数一：我们要排序的数组
     *   参数二：要排序数组的起始索引
     *   参数三：要排序数组的结束索引
     * */
    public static void quickSort(int[] arr, int i, int j)
    {
        if (i>=j)
        {
            return;
        }
        int startIndex=i;
        int endIndex=j;


        while (startIndex<endIndex)
        {
            while (arr[endIndex]>=arr[i]&&startIndex<endIndex)
            {
                endIndex--;
            }
            while (arr[startIndex]<=arr[i]&&startIndex<endIndex)
            {
                startIndex++;
            }
            //把end和start指向的元素进行交换
            int temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
        }
        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp=arr[i];
        arr[i]=arr[startIndex];
        arr[startIndex]=temp;

        //确定左边的范围，重复刚刚所做的事情
        quickSort(arr,i,startIndex-1);
        //确定右边的范围，重复刚刚所做的事情
        quickSort(arr,startIndex+1, j);

    }

}
