package test1.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Mike");
        map.put(2,"Tom");
        map.put(3,"Salar22");
        map.put(4,"MiMi");
        //借用set集合进行遍历
        Set<Integer> set = new HashSet<>();
        set.addAll(map.keySet());
        for(Integer i:set){
            System.out.println(map.get(i));
        }
        //使用Map中的Entry进行遍历
        Set<Map.Entry<Integer,String>> set3 = map.entrySet();
        for(Map.Entry entry : set3){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
