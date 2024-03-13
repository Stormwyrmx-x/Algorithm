import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("胡", 99);
        map.put("weng", 80);
        map.put("zhu", 85);
        map.put("fao", 60);
        /**
         * 通过键来找值
         */
        for (String key : map.keySet())
        {
            System.out.print(key + ":");
            System.out.print(map.get(key));
            System.out.println();
        }
        System.out.println(map.keySet());
        /**
         * 键值对
         */
        System.out.println(map.entrySet());
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            System.out.println();
        }
        /**
         *  lambda遍历
         */
        map.forEach((s, integer) -> System.out.println(s + ":" + integer));


    }
}
