package org.example.sort;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer>arrayList=new ArrayList<>();
        Collections.addAll(arrayList,12,21,0,9,33,12,15);
        quickSort(arrayList,0,arrayList.size()-1);

        arrayList.forEach(integer -> System.out.println(integer));

    }
    public static void quickSort(ArrayList<Integer>arrayList, int i, int j)
    {
        if (i>=j)
        {
            return;
        }
        int startIndex=i;
        int endIndex=j;

        while (startIndex<endIndex)
        {
            while (startIndex<endIndex&&arrayList.get(i)<=arrayList.get(endIndex))
            {
                endIndex--;
            }
            while (startIndex<endIndex&&arrayList.get(i)>=arrayList.get(startIndex))
            {
                startIndex++;
            }
            Collections.swap(arrayList,startIndex,endIndex);
        }
        Collections.swap(arrayList,i,startIndex);

        quickSort(arrayList,i,startIndex-1);
        quickSort(arrayList,startIndex+1,j);
    }
}
