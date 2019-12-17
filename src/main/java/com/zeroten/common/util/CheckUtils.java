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

    public static boolean equals(String str1, String str2) {
        if(str1 == null || str2 == null) {
            return false;
        }
        if(str1.equals(str2))
            return true;
        return false;
    }

    public static boolean equalsInteger(Integer n1, Integer n2) {
        if(n1 == null || n2 == null) {
            return false;
        }
        if(n1.equals(n2))
            return true;
        return false;
    }

    public static int[] sort(int[] arr) {
        int temp;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
