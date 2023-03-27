package cn.ssdut.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaaa");
        set.add("dddd");
        set.add("cccc");
        set.add("aaaa");
        set.add("dddd");
        for(Object obj:set){
            System.out.println((String) obj);
        }
    }
}
