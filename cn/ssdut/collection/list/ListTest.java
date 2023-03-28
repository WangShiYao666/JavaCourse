package cn.ssdut.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaaa");
        list.add("dddd");
        list.add("cccc");
        list.add("aaaa");
        list.add("eeee");
        list.add("dddd");
        for(int i = 0; i < list.size(); i++){
            System.out.println((String)list.get(i));
        }
    }
}
