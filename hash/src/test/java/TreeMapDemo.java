import com.weng.entity.Girl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo
{
    @Test
    public void testShopping()
    {
        TreeMap<Integer,String>treeMap=new TreeMap<>((o1, o2) -> {
            return o2-o1;
        });
        treeMap.put(3,"罩杯");
        treeMap.put(2,"内衣");
        treeMap.put(1,"袜子");
        treeMap.put(3,"衣服");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet())
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
    @Test
    public void testGirl()
    {
        TreeMap<Girl,String>map=new TreeMap<>();
        map.put(new Girl("hu",21),"崇川");
        map.put(new Girl("weng",21),"太仓");
        map.put(new Girl("yang",22),"太仓");
        map.put(new Girl("fao",21),"宿迁");
        map.put(new Girl("zhu",21),"南通");

        map.forEach((girl, s) -> {
            System.out.println(girl+"="+s);
        });

    }

    @Test
    public void testString()
    {
        //要求对结果进行排序
        String s="abcdaabcde";
        TreeMap<Character,Integer>map=new TreeMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        map.forEach((character, integer) -> stringBuilder.append(character).append("(").append(integer).append(")"));
        System.out.println(stringBuilder);
    }

}
