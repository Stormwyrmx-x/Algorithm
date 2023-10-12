import com.weng.entity.Girl;
import com.weng.entity.Student;
import org.junit.Test;

import java.util.*;

public class HashMapDemo
{
    @Test
    public void testGirl()
    {
        Map<Girl,String>map=new HashMap<>();

        map.put(new Girl("hu",21),"崇川");
        map.put(new Girl("weng",21),"太仓");
        map.put(new Girl("yang",22),"太仓");
        map.put(new Girl("fao",21),"宿迁");
        map.put(new Girl("zhu",21),"南通");

        Set<Girl> girls = map.keySet();
        for (Girl girl : girls)
        {
            System.out.println(girl+"="+map.get(girl));
        }
        System.out.println("========================");
        Set<Map.Entry<Girl, String>> entries = map.entrySet();
        for (Map.Entry<Girl, String> entry : entries)
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("========================");
        map.forEach((girl, s) -> {
            System.out.println(girl+"="+s);
        });

        System.out.println(map);
    }

    @Test
    public void testAttraction()
    {
        String []arr={"A","B","C","D"};
        //集合里存储80位同学的投票记录
        ArrayList<String>arrayList=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 80; i++)
        {
            int index = random.nextInt(arr.length);
            arrayList.add(arr[index]);
        }
        //将每个景点的次数存入hashmap中
        HashMap<String, Integer>hashMap=new HashMap<>();
        arrayList.forEach(s -> {
            if (hashMap.containsKey(s))
            {
                hashMap.put(s,hashMap.get(s)+1);
            }
            else
            {
                hashMap.put(s,1);
            }
        });
        //求最大值
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        int max=0;
        for (Map.Entry<String, Integer> entry : entries)
        {
            max=Math.max(max,entry.getValue());
        }
        //若景点的次数和最大值相同，则打印出来
        for (Map.Entry<String, Integer> entry : entries)
        {
            if (entry.getValue()==max)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
