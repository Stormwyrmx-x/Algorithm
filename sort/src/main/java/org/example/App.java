package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       ArrayList<Integer>arrayList=new ArrayList<>();
//
//        Scanner in=new Scanner(System.in);
//        while (in.hasNextLine())
//        {
//            arrayList.add(Integer.valueOf(in.nextLine()));
//        }
//        System.out.println(arrayList);
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        while (scan.hasNext()) {
            String str2 = scan.nextLine();
            String[] s = str2.split(" ");
            List<String> strings = Arrays.asList(s);
            List<String> s1 = List.of(s);
            Arrays.stream(s);
//            s1.sort();
//            s1.stream();
//            Arrays.sort();
//            Collections.sort();
            System.out.println("输入的数据为：" + str2);
        }
//        scan.close();

    }
}
