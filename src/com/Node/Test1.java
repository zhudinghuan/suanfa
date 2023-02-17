package com.Node;

import java.util.*;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2023/02/16 15:22
 */
public class Test1 {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int i = in.nextInt();
        int times = (i+1) / 2;
        List list = new ArrayList<Integer>();
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            if (!integerIntegerHashMap.isEmpty() && integerIntegerHashMap.containsKey(a)) {
                integerIntegerHashMap.put(a, integerIntegerHashMap.get(a) + 1);
            } else {
                integerIntegerHashMap.put(a, 1);
            }
            list.add(a);
            if (list.size() == i) {
                break;
            }
        }
        integerIntegerHashMap.entrySet().forEach(item -> {
            if (item.getValue() >= times) {
                System.out.println(item.getKey());
            }
        });


    }

}
