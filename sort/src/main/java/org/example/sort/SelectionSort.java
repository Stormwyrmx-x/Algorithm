package org.example.sort;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr ={2,4,5,3,1,8,0};
        int temp;
        int min;
//        for (int i = 0; i < arr.length-1; i++)
//        {
//            min=i;
//            for (int j = i+1; j < arr.length; j++)
//            {
//                if (arr[min]>arr[j])
//                {
//                    min=j;
//                }
//            }
//            if (min!=i)
//            {
//                temp=arr[i];
//                arr[i]=arr[min];
//                arr[min]=temp;
//            }
//        }
        int max;
        for (int i = arr.length-1; i >=0 ; i--)
        {
            max=i;
            for (int j = i-1; j >=0 ; j--)
            {
                if (arr[max]<arr[j])
                {
                    max=j;
                }
            }
            if (max!=i)
            {
                temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
            }
        }
        
        
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
