package com.zeroten.common.util;

import java.util.Arrays;

public class CheckUtils {
    public static boolean isAnyEmpty(String[] strings) {
//        Arrays.asList(strings).forEach(string -> {
//            if(string == null || string == "") {
//        /*
//        为什么此处不能返回false
//        是不是lambda中不能使用返回值
//        自动生成的是return;
//         */
//                return false;
//            }
//        });
        for(String string : strings) {
            if (string == null || string == "") {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object[] arr) {
        if(arr == null) {
            return true;
        }
        return false;
    }
}
