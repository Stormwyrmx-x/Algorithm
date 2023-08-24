package org.example.sort;

public class InsertSort
{
    public static void main(String[] args)
    {
        int [] arr={3,44,38,5,47,15,36,26};
        int startIndex=-1;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]>arr[i+1])
            {
                startIndex=i+1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++)
        {
            for (int j = i; j >0 ; j--)
            {
                if (arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }

        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
