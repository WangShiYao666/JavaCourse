package cn.ssdut.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map countries = new HashMap<String, String>();
        countries.put("CN", "中华人民共和国");
        countries.put("RU","俄罗斯联邦");
        countries.put("FR","法兰西共和国");
        countries.put("US","美利坚共和国");


        System.out.println((String) countries.get("FR"));
        System.out.println("共有"+countries.size()+"条数据");
        countries.remove("FR");
        System.out.println("删除后共有"+countries.size()+"条数据");
        System.out.println("删除后是否还包含FR?"+countries.containsKey("FR"));
        Set keySet = countries.keySet();
        System.out.println("keyset="+keySet);
        System.out.println("values="+countries.values());
        System.out.println("countries:"+countries);
//        Iterator it = keySet.iterator();
//        while (it.hasNext()){
//            String key = (String)it.next();
//            System.out.println( key + "->" + (String)countries.get(key));
//        }
    }
}
