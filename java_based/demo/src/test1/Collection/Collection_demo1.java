package test1.Collection;

import java.sql.SQLOutput;
import java.util.*;

public class Collection_demo1 {
    public static void main(String[] args) {
        var a = new LinkedList<String>();//有序链表
        a.add("Amy");//将对象添加的尾部
        a.add("Carl");
        a.add("Erica");
        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        ListIterator<String> aIter = a. listIterator();//迭代器,listIterator()方法，可以返回实现ListIterator接口的迭代器对象
//        aIter.add("Tom");
//        String re = aIter.next();
//        aIter.set("AAA");
//        aIter.add("Tom2");
//        System.out.println(a);
//        System.out.println(re);
        Iterator<String> BIter = b.iterator();//直接用继承自Collection的iterator方法
        while(BIter.hasNext()){
            if(aIter.hasNext())aIter.next();
            aIter.add(BIter.next());
        }
        System.out.println(a);
        BIter = b.iterator();
        System.out.println(b);
        while(BIter.hasNext()){
            BIter.next();
            if(BIter.hasNext()){
                BIter.next();
                BIter.remove();
            }
        }
        System.out.println(b);
        a.remove(b);
        System.out.println(a);
        aIter = a.listIterator();
        aIter.next();
        aIter.next();
        String pr = aIter.previous();
        System.out.println(pr);

    }
}
