package com.Node;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Function;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/06 21:57
 */
public class Test {
    /*
       定义一个方法
       方法的参数传递一个字符串类型的整数
       方法的参数传递一个Function接口，泛型使用<String,Integer>
       使用Function接口中的方法apply,把字符串类型的整数，转换为Integer类型的数据
       */
    public static <String,Integer> Integer change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s); //自动拆箱 Integer-->int
        System.out.println(in);
        return in;
    }

    public static void main(String[] args) {
//        //定义一个字符串类型的整数
//        String s = "123";
//        //调用change方法，传递字符串类型的整数，和Lambda表达式
//        Integer change = change(s, (String str) -> {
//            //把字符串类型的整数，转换为Integer类型的数据
////            return Integer.parseInt(str);
//            return 1;
//        });
//        System.out.println(change);
//
//        //优化Lambda
//        change(s, str-> Integer.parseInt(str));

        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
            System.out.println(arr[i].toString());
        }
    }

}
