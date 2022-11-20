package com.powernode;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        String a = "AA|BBBBBB|C|D|E|HHH|II|";
        String b = "7548921526181";
        String[] as = getStrings(a);
        getString(as);
        String[] bs = getStrings(b);
        getAdd(bs);
        int i = 5;
        int res = 1;
        getJie(i,res);

    }

    /**
     * 将string转换string数组
     * @param s
     * @return
     */
    public static String[] getStrings(String s){
        String[] chars = s.split("");
        return  chars;
    }

    /**
     * 将string数组去重
     * @param strings
     * @return
     */
    public static  String getString(String[] strings){
        String s = "";
        for (String aChar : strings) {
            if (aChar .equals("|") ){
                s = s + aChar;
            }else {
                if (s.indexOf(aChar) < 0){
                    s = s + aChar;
                }
            }
        }
        System.out.println(s);
        return s;
    }

    /**
     * 计算string奇数算术和
     * @param bs
     */
    public static void getAdd(String[] bs){
        int add = 0;
        for (int i = 0; i < bs.length; i++) {
            if (i % 2 == 1){
                int j = Integer.parseInt(bs[i]);
                add += j;
            }
        }
        System.out.println(add);
    }

    public static  void getJie(int i,int res){
        res = res * i;
        if (i > 1){
            getJie(--i,res);
        }else {
            System.out.println(res);
        }
    }
}
