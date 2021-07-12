package test1.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_demo2 {
    public static void main(String[] args) {
        Set<String> set =  new HashSet<>();//无须的
        set.add("Mike");
        set.add("Tom");
        set.add("Salar");
        set.add("MiMi");
        set.add("Salar");
        //使用迭代器遍历
        Iterator<String> iterato = set.iterator();
        while(iterato.hasNext()){
            System.out.println(iterato.next());
        }
        //使用foreach遍历
        for(String s:set){
            System.out.println(s);
        }

        Set<String> set2 = new LinkedHashSet();//有序
        set2.add("a");
        set2.add("b");
        set2.add("c");
        set2.add("d");
        for(String s:set2){
            System.out.println(s);
        }



    }
}
