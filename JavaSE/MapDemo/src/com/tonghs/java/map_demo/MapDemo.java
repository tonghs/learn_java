package com.tonghs.java.map_demo;

import java.util.HashMap;
import java.util.Map;

/**
 * MapDemo class
 *
 * @author tonghs
 * @date 2021/06/03
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "tonghs");
        map.put("002", "kkking");
        System.out.println(map.containsKey("001"));
        System.out.println(map.containsKey("003"));
        System.out.println(map.containsValue("tttt"));
        System.out.println(map.containsValue("tonghs"));
        map.put("001", "tttt");
        System.out.println(map);
//
//        System.out.println(map.get("001"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//
//        map.remove("002");
//        System.out.println(map);
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());
//        map.clear();
//        System.out.println(map);
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());

        for(String k: map.keySet()) {
            System.out.println(map.get(k));
        }

        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
