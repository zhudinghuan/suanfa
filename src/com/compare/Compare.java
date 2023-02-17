package com.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/24 23:06
 */
public class Compare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }


    public static void main(String[] args) {
        String[] str1 = {"db" , "bc" , "cd"};
        Arrays.sort(str1, new Compare());
        for(int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
