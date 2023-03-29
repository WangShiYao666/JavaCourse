package cn.ssdut.collection.set;

import cn.ssdut.pet.Dog;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        String s1=new String("java");
//        String s2=s1;
//        String s3=new String("JAVA");
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
        Dog ouou = new Dog("欧欧","雪娜瑞");
        Dog yaya = new Dog("亚亚", "拉布拉多");
        Dog feifei = new Dog("菲菲", "拉布拉多");
        Dog meimei = new Dog("美美", "雪娜瑞");

        set.add(ouou);
        set.add(ouou);
        set.add(feifei);
        set.add(meimei);

        System.out.println("set size = "+set.size());
//        for(Object obj : set){
//            System.out.println((String) obj);
//        }
    }
}
