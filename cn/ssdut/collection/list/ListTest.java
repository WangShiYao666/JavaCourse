package cn.ssdut.collection.list;

import cn.ssdut.pet.Dog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List dogs = new LinkedList();
        Dog ouou = new Dog("欧欧","雪娜瑞");
        Dog yaya = new Dog("亚亚", "拉布拉多");
        Dog feifei = new Dog("菲菲", "拉布拉多");
        Dog meimei = new Dog("美美", "雪娜瑞");
        dogs.add(ouou);
        dogs.add(yaya);
        dogs.add(feifei);
        dogs.add(meimei);

//        dogs.remove(0); //删除第一条狗狗
//        dogs.remove(feifei); //删除菲菲

        System.out.println("共计 "+ dogs.size() + " 条狗狗。");
        System.out.println("分别是:");
        for(int i = 0; i < dogs.size(); i++){
            Dog dog = (Dog)dogs.get(i);
            System.out.println(dog.getName() + " " + dog.getStrain());
        }
        System.out.println("是否包含欧欧? "+ dogs.contains(ouou));
    }
}
