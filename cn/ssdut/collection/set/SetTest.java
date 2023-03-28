package cn.ssdut.collection.set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaaa");
        set.add("bbbb");
        set.add("cccc");
        set.add("aaaa");
        set.add("bbbb");
        System.out.println("set size = "+set.size());
        for(Object obj : set){
            System.out.println((String) obj);
        }
    }
}
