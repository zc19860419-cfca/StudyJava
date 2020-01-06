package com.test.demo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangchong
 * @CodeReviewer zhangqingan
 * @Description
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // 第三个参数用于指定accessOrder值
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(1, 1);
        linkedHashMap.put(2, 2);
        linkedHashMap.put(3, 3);
        System.out.println("开始时顺序：");
        Set<Map.Entry<Integer, Integer>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
        System.out.println("通过get方法，导致key为name1对应的Entry到表尾");
        linkedHashMap.get("name1");
        Set<Map.Entry<Integer, Integer>> set2 = linkedHashMap.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry entry = iterator2.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }

    }
}
