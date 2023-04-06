package chapter14.collections;

import java.util.HashMap;
import java.util.Map;

public class MAp {

    public static void main(String[] args) {
        Map map = new HashMap<String , Integer>();
        map.put("aaa",5);
        map.put("bbb",6);
        map.put("ccc",7);
        for (Object map1 : map.keySet()) {
            System.out.println(map1);

        }

    }

}



