package org.example.search;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int [] a={7,23,79,81,103,127,131,147};
        //查找某元素在数组中的索引
        int index = binarySearch(a, 131);
        System.out.println(index);


    }
    public static int binarySearch(int [] arr,int number)
    {
        int min=0;
        int max=arr.length-1;
        int mid;
        while (min<=max)
        {
//            mid=(min+max)/2;
            mid=min+(number-arr[min])/(arr[max]-arr[min])*(max-min);//插值查找
            if (arr[mid]==number)
            {
                return mid;
            }
            else if (arr[mid]<number)
            {
                min=mid+1;
            }
            else if (arr[mid]>number)
            {
                max=mid-1;
            }
        }
        return -1;
    }
}
