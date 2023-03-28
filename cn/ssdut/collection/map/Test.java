package cn.ssdut.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map m = new HashMap<String, String>();
        m.put("CN", "CHINA");
        m.put("JP","JAPAN");
        Set keySet = m.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            String key = (String)it.next();
            System.out.println( key + "->" + (String)m.get(key));
        }
    }
}
