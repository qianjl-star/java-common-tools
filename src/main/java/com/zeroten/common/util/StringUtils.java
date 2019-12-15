package com.zeroten.common.util;

public class StringUtils {
    public static String trimAll(String str) {
        StringBuilder sb = new StringBuilder();

        char[] ch = str.toCharArray();
        for(int index=0; index<ch.length; index++) {
            if(ch[index] != ' ') {
                sb.append(ch[index]);
            }
        }
        return sb.toString();
    }
}
